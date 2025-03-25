package PaooGame.Items;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

import PaooGame.RefLinks;
import PaooGame.Graphics.Assets;
import PaooGame.Tiles.Tile;

 //Implementeaza notiunea de monstru Sik
public class Monster extends Character
{
    private BufferedImage image;    /*!< Referinta catre imaginea curenta a eroului.*/
    private int counterAnimatie = 1;
    private int animatie = 0;   // contor numar de animatie uri

    private int moveMin = 29;
    private int moveMax = 33;
    private String direction = "left";  //directia de deplasare a inamicului

    public Monster(RefLinks refLink, float x, float y) ///constructor
    {
        //Apel al constructorului clasei de baza
        super(refLink, x ,y, Character.DEFAULT_CREATURE_WIDTH, Character.DEFAULT_CREATURE_HEIGHT);
        //Seteaza imaginea de start a eroului
        image = Assets.monsterLeft[animatie];
        //Stabilieste pozitia relativa si dimensiunea dreptunghiului de coliziune, starea implicita(normala)
        normalBounds.x = 0;
        normalBounds.y = 0;
        normalBounds.width = 64;
        normalBounds.height = 64;
    }
    private void MonterIlustrate() { //seteaza animatia eroului in functie de directie
        if(Objects.equals(direction, "left"))
            image = Assets.monsterLeft[animatie];
        else if(Objects.equals(direction, "right"))
            image = Assets.monsterRight[animatie];
        counterAnimatie++;
        if (counterAnimatie > 2) { //ca sa mearga rapiddddd
            counterAnimatie = 0;
            animatie++;
            if (animatie > 17)
                animatie = 0;
        }
    }

    /*! \fn public void Update()
        \brief Actualizeaza pozitia si imaginea eroului.
     */
    @Override
    public void Update() {
        MonterIlustrate();
        ///Actualizeaza pozitia
        Move();
        normalBounds.x = (int)(x - refLink.GetGame().GetCamera().GetX() + 16);
        normalBounds.y = (int)(y - refLink.GetGame().GetCamera().GetY() + 16);
    }
    @Override
    public void Move() {//suprascriere din character
        //limiteaza miscarea intre moveMin si moveMax
        if (Objects.equals(direction, "left")) {
            if (x <= moveMin * Tile.TILE_WIDTH) {
                direction = "right";
            } else {
                x -= speed/4;
            }
        } else if (Objects.equals(direction, "right")) {
            if (x >= moveMax * Tile.TILE_WIDTH) {
                direction = "left";
            } else {
                x += speed/4;
            }
        }
    }
   //Randeaza/deseneaza monstrul in noua pozitie.

    @Override
    public void Draw(Graphics g)
    {
        g.drawImage(image, (int)(x - refLink.GetGame().GetCamera().GetX() ), (int)(y - refLink.GetGame().GetCamera().GetY() ), width, height, null);
        g.setColor(Color.BLACK);
    }
}
