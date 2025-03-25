package PaooGame.Items;

import PaooGame.RefLinks;
import PaooGame.Tiles.Tile;

/*! \class public abstract class Character extends Item
    \brief Defineste notiunea abstracta de caracter/individ/fiinta din joc.

    Notiunea este definita doar de viata viteza de deplasare si distanta cu care trebuie sa se
    miste/deplaseze in urma calculelor.
 */
public abstract class Character extends Item
{
    public static final int DEFAULT_LIFE            = 3;   // Constanta < Valoarea implicita a vietii unui caracter
    public static final float DEFAULT_SPEED         = 3.0f; // Constanta < Viteza implicita a unu caracter
    public static final int DEFAULT_CREATURE_WIDTH  = 64;   // Constanta< Latimea implicita a imaginii caracterului
    public static final int DEFAULT_CREATURE_HEIGHT = 64;   // Constanta < Inaltimea implicita a imaginii caracterului

    public static final float DEFAULT_JUMP            =4.0f;  // viteza pt jump
    protected int life;     // Retine viata caracterului
    protected float jump_speed;


    protected float speed;  // Retine viteza de deplasare caracterului
    protected float xMove;  // Retine noua pozitie a caracterului pe axa X
    protected float yMove;  // Retine noua pozitie a caracterului pe axa Y

    /*! \fn public Character(RefLinks refLink, float x, float y, int width, int height)
        \brief Constructor de initializare al clasei Character

        \param refLink Referinta catre obiectul shortcut (care retine alte referinte utile/necesare in joc).
        \param x Pozitia de start pa axa X a caracterului.
        \param y Pozitia de start pa axa Y a caracterului.
        \param width Latimea imaginii caracterului.
        \param height Inaltimea imaginii caracterului.
     */
    public Character(RefLinks refLink, float x, float y, int width, int height)
    {
        //Apel constructor la clasei de baza
        super(refLink, x,y, width, height);  //pt ca character mosteneste tot ce are Item
        //Seteaza pe valorile implicite pentru viata, viteza si distantele de deplasare
        life    = DEFAULT_LIFE;
        speed   = DEFAULT_SPEED;
        jump_speed = DEFAULT_JUMP;
        xMove   = 0;
        yMove   = 0;
    }

      // Move() Modifica pozitia caracterului
    public void Move() {
        MoveX();
        MoveY();
    }
    public void MoveX() {
        // Adauga verificarea pentru a nu depași limitele ferestrei de joc pe axa X
        if (xMove < 0) { // Mergi spre stânga
            if (x + xMove >= 0) {
                x += xMove;
            } else {
                x = 0;
            }
        } else if (xMove > 0) { // Mergi spre dreapta
            if (x + xMove + normalBounds.width <= refLink.GetMap().GetWidth() * Tile.TILE_WIDTH) {
                x += xMove;
            } else {
                x = refLink.GetMap().GetWidth()*48 - normalBounds.width;
            }
        }
    }

    public void MoveY() {
        // Adauga verificarea pentru a nu depași limitele ferestrei de joc pe axa Y
        if (yMove < 0) { // Mergi in sus
            if (y + yMove >= 0) {
                y += yMove;
            } else {
                y = 0;
            }
        } else if (yMove > 0) { // Mergi in jos
            if (y + yMove + normalBounds.height <= refLink.GetMap().GetHeight() * Tile.TILE_HEIGHT) {
                y += yMove;
            } else {
                y = refLink.GetMap().GetHeight()*48 - normalBounds.height;
            }
        }
    }
    public int GetLife()
    {
        return life;
    }
    public float GetSpeed()
    {
        return speed;
    }
    public void SetLife(int life)
    {
        this.life = life;
    }

    public void ReduceLife(int life)
    {
        this.life -= life;
    }
    public void SetSpeed(float speed) {
        this.speed = speed;
    }
    public float GetXMove()
    {
        return xMove;
    }

    // Returneaza distanta in pixeli pe axa Y cu care este actualizata pozitia caracterului
    public float GetYMove()
    {
        return yMove;
    }

   // Seteaza distanta in pixeli pe axa X cu care va fi actualizata pozitia caracterului
    public void SetXMove(float xMove)
    {
        this.xMove = xMove;
    }

  // Seteaza distanta in pixeli pe axa Y cu care va fi actualizata pozitia caracterului
    public void SetYMove(float yMove)
    {
        this.yMove = yMove;
    }
}

