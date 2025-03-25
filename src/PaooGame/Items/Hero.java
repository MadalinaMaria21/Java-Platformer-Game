package PaooGame.Items;
import java.awt.*;
import java.awt.image.BufferedImage;
import PaooGame.Levels.Level1;
import PaooGame.Levels.Level2;
import PaooGame.Levels.Level3;
import PaooGame.RefLinks;
import PaooGame.Graphics.Assets;
import PaooGame.Tiles.Tile;

/*! \class public abstract class Hero extends Character
    \brief  Implementeaza notiunea de erou/player (caracterul controlat de jucator)
 */
public class Hero extends Character
{
    private static       Hero instance;
    private              BufferedImage image;    // Referinta catre imaginea curenta a eroului
    private int          counterAnimatie = 1;
    private int          animatie        = 0;   // contor numar de animatie uri
    private int          animationCount = 0;

    private  boolean jumping;

    private float gravity       = 0.04f;             //forta de gravitatie
    private float fallSpeed     = 1.7f;              //viteza de cadere
    private float jumpSpeed     = -3.25f;            //viteza in salt
    private float maxFallSpeed  = 3.5f;              //viteza maxima de cadere
    private boolean inAir = false;

    // Constructorul de initializare al clasei Hero
    private Hero(RefLinks refLink, float x, float y) //constructor
    {
        //Apel al constructorului clasei de baza
        super(refLink, x ,y, Character.DEFAULT_CREATURE_WIDTH, Character.DEFAULT_CREATURE_HEIGHT);
        //Seteaza imaginea de start a eroului
        image = Assets.heroIdle[animatie];
        //Stabilieste pozitia relativa si dimensiunea dreptunghiului de coliziune, starea implicita(normala)
        normalBounds.x      = 16;
        normalBounds.y      = 16;
        normalBounds.width  = 32;
        normalBounds.height = 48;
    }

    public static Hero GetInstance(RefLinks refLink, float x, float y)// responsabil singleton Hero
    {
        if(instance == null)
            instance = new Hero(refLink, x, y);
        return instance;
    }
    public static void RemoveInstance()//sterge instanta Hero
    {
        if(instance != null)
            instance = null;
    }

    private void Kaira()//animatiile pentru fiecare nivel pentru Kaira

    {///level1
        if(refLink.GetGame().getPlayState().GetLevel() instanceof Level1) {
            if (refLink.GetKeyManager().up) {
                image = Assets.heroJumpRight[animatie];
            } else if (refLink.GetKeyManager().down) {
                image = Assets.heroRunRight[animatie];
            } else if (refLink.GetKeyManager().left) {
                image = Assets.heroRunLeft[animatie];
            } else if (refLink.GetKeyManager().right) {
                image = Assets.heroRunRight[animatie];
            } else {
                image = Assets.heroIdle[animatie];
            }
        }
        if (refLink.GetMap().GetTile((int)x/Tile.TILE_WIDTH, (int)y/Tile.TILE_HEIGHT) == Tile.usa)
            image = Assets.heroGift[animatie];
        ///level2
        else if(refLink.GetGame().getPlayState().GetLevel() instanceof Level2) {
            if (refLink.GetKeyManager().up) {
                image = Assets.heroJumpRight2[animatie];
            } else if (refLink.GetKeyManager().down) {
                image = Assets.heroRunRight2[animatie];
            } else if (refLink.GetKeyManager().left) {
                image = Assets.heroRunLeft2[animatie];
            } else if (refLink.GetKeyManager().right) {
                image = Assets.heroRunRight2[animatie];
            } else {
                image = Assets.heroIdle2[animatie];
            }
        }
        if (refLink.GetMap().GetTile((int)x/Tile.TILE_WIDTH, (int)y/Tile.TILE_HEIGHT) == Tile.usa2)
            image = Assets.heroGift2[animatie];
        ///level3
        else if(refLink.GetGame().getPlayState().GetLevel() instanceof Level3) {
            if (refLink.GetKeyManager().up) {
                image = Assets.heroJumpRight3[animatie];
            } else if (refLink.GetKeyManager().down) {
                image = Assets.heroRunRight3[animatie];
            } else if (refLink.GetKeyManager().left) {
                image = Assets.heroRunLeft3[animatie];
            } else if (refLink.GetKeyManager().right) {
                image = Assets.heroRunRight3[animatie];
            } else {
                image = Assets.heroIdle3[animatie];
            }
        }
        if (refLink.GetMap().GetTile((int)x/Tile.TILE_WIDTH, (int)y/Tile.TILE_HEIGHT) == Tile.usa3)
            image = Assets.heroGift3[animatie];

        //pentru actualizarea pozelor din sprite
        counterAnimatie++;
        if (counterAnimatie > 5) {//ca sa mearga relativ rapid
            counterAnimatie = 0;
            animatie++;
            if (animatie > 9)
                animatie = 0;
        }
    }

    private void UpdateMovement() {
        xMove = 0;

        // Verificare apasare tasta "stanga"
        if (refLink.GetKeyManager().left) {
            if (IsFree((int)(this.x - speed), (int)this.y)) {
                xMove = -speed;
            }
        }

        // Verificare apasare tasta "dreapta"
        if (refLink.GetKeyManager().right) {
            if (IsFree((int)(this.x + speed), (int)this.y)) {
                xMove = speed;
            }
        }

        // Verificare apasare tasta "jos"
        if (refLink.GetKeyManager().down) {
            if (IsFree((int)(this.x), (int)(this.y + speed))) {
                yMove = speed;
            }
        }

        // Verificare apasare tasta "sus"
        if (refLink.GetKeyManager().up) {
            if (!jumping && !inAir) {
                Jump();
            }
        }
        // logica pentru saritura, deci daca sare:
        if (jumping) {
            fallSpeed += gravity;
            yMove = fallSpeed;
            if (!IsFree((int) x, (int) (y + fallSpeed))) {
                yMove = 0;
                jumping = false;
            }
            //in coborare:
            if (fallSpeed >= 0) {
                jumping = false;
            }
        }
        //daca nu sare:
        else {
            //daca dala solida -> jos
            if (!IsFree((int) x, (int) (y + fallSpeed))) {
                yMove = 0;
                inAir = false;
            }
            //daca dala nu e solida
            else {
                yMove = fallSpeed;
                inAir = true;
            }

            if (inAir) {
                fallSpeed += gravity;
                if(fallSpeed >= maxFallSpeed) {
                    fallSpeed = maxFallSpeed;
                }
            }
        }
    }

    //daca nu sare deja, sare  acum
    private void Jump() {
        if (!jumping) {
            jumping = true;
            fallSpeed = jumpSpeed;
            inAir = true;
        }
    }

    /*! \fn public void Update()
        \brief Actualizeaza pozitia si imaginea eroului.
     */
    @Override
    public void Update() {
        ///Centrare camera
        refLink.GetGame().GetCamera().update(this);

        UpdateMovement();
        Move();

        normalBounds.x = (int)(x - refLink.GetGame().GetCamera().GetX() + 16);
        normalBounds.y = (int)(y - refLink.GetGame().GetCamera().GetY() + 16);

        ///Actualizeaza imaginea
        Kaira();
    }
    public boolean IsFree(int nextX, int nextY) {
        // Calcularea coordonatelor următoarelor dale
        int nextX_SS = ((nextX + 16)/ Tile.TILE_WIDTH);
        int nextY_SS = ((nextY + 16)/ Tile.TILE_HEIGHT);

        int nextX_DS = ((nextX + normalBounds.width + 12) / Tile.TILE_WIDTH);
        int nextY_DS = ((nextY + 16)/ Tile.TILE_HEIGHT);

        int nextX_SJ = ((nextX + 16)/ Tile.TILE_WIDTH);
        int nextY_SJ = ((nextY + normalBounds.height + 12) / Tile.TILE_HEIGHT);

        int nextX_DJ = ((nextX + normalBounds.width + 12) / Tile.TILE_WIDTH);
        int nextY_DJ = ((nextY + normalBounds.height + 12) / Tile.TILE_HEIGHT);

        // Verificarea coliziunii cu dalele
        return !(refLink.GetMap().GetTile(nextX_SS, nextY_SS).IsSolid()
                || refLink.GetMap().GetTile(nextX_SJ, nextY_SJ).IsSolid()
                || refLink.GetMap().GetTile(nextX_DS, nextY_DS).IsSolid()
                || refLink.GetMap().GetTile(nextX_DJ, nextY_DJ).IsSolid());
    }
    // Verifica daca dalele sunt mortale
    public boolean IsBad(int nextX, int nextY) {
        int nextX_SS = (nextX + 16) / Tile.TILE_WIDTH;
        int nextY_SS = (nextY + 16) / Tile.TILE_HEIGHT;

        int nextX_DS = (nextX + normalBounds.width + 12) / Tile.TILE_WIDTH;
        int nextY_DS = (nextY + 16) / Tile.TILE_HEIGHT;

        int nextX_SJ = (nextX + 16) / Tile.TILE_WIDTH;
        int nextY_SJ = (nextY + normalBounds.height + 12) / Tile.TILE_HEIGHT;

        int nextX_DJ = (nextX + normalBounds.width + 12) / Tile.TILE_WIDTH;
        int nextY_DJ = (nextY + normalBounds.height + 12) / Tile.TILE_HEIGHT;

        return refLink.GetMap().GetTile(nextX_SS, nextY_SS).IsBad()
                || refLink.GetMap().GetTile(nextX_SJ, nextY_SJ).IsBad()
                || refLink.GetMap().GetTile(nextX_DS, nextY_DS).IsBad()
                || refLink.GetMap().GetTile(nextX_DJ, nextY_DJ).IsBad();
    }

    public void ResetHeroPosition() {
        // Resetați poziția eroului
        x = 0;
        y = 420;
        xMove = 0;
        yMove = 0;
        jumping = false;
    }
    /*! \fn public void Draw(Graphics g)
        \brief Randeaza/deseneaza eroul in noua pozitie.

        \brief g Contextul grafi in care trebuie efectuata desenarea eroului.
     */
    @Override
    public void Draw(Graphics g)
    {
        g.drawImage(image, (int)(x - refLink.GetGame().GetCamera().GetX() ), (int)(y - refLink.GetGame().GetCamera().GetY() ), width, height, null);
        g.setColor(Color.BLACK);
        //g.setColor(Color.BLUE);//culoarea pt dreptunghi
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString(" " + life, 50, 100);
    }
}

