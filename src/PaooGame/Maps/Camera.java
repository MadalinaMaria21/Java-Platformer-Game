package PaooGame.Maps;
import PaooGame.Items.Item;
import PaooGame.RefLinks;
import PaooGame.Tiles.Tile;
//implementeza notiunea de camera, care se deplaseaza o data cu eroul
public class Camera {
    private float x;
    private float y;
    private  RefLinks refLinks;

    public Camera(RefLinks refLinks, float x, float y)  //constructor
    {
        if(refLinks == null) {
            System.out.println("refLinks is null!");
        }
        this.refLinks = refLinks;
        this.x        = x;
        this.y        = y;
    }

    public void update(Item character) {
        //gasesc punctul din mijloc al caracterului, apoi scaj jumatate din lunigime/latime
        //ca sa rezulte punctul din stanga sus pt camera mica
        x = character.GetX()- refLinks.GetWidth()/2 + character.GetWidth()/2;
        y = character.GetY()- refLinks.GetHeight()/2 + character.GetHeight()/2;
        checkLimits();
    }

    public void checkLimits()   // verific daca am iesit din ecran
    {
        if(null == refLinks)
            System.out.println("reflink");
        else if(refLinks.GetMap() == null)
            System.out.println("map");

        //pt toata harta
        float mapWidth = refLinks.GetMap().GetWidth() * Tile.TILE_WIDTH;
        float mapHeight = refLinks.GetMap().GetHeight() * Tile.TILE_HEIGHT;
        //latimea si inaltimea pt camera mica
        float screenWidth = refLinks.GetWidth();
        float screenHeight = refLinks.GetHeight();

        if (x < 0) {
            x = 0;
        } else if (x > mapWidth - screenWidth) {//ca sa nu am margini albe extra hartii
            x = mapWidth - screenWidth;
        }

        if (y < 0) {
            y = 0;
        } else if (y > mapHeight - screenHeight) {//ca sa nu am margini albe extra hartii
            y = mapHeight - screenHeight;
        }
    }
    public float GetX()
    {
        return x;
    }
    public float GetY()
    {
        return y;
    }
    public void setY(float y)
    {
        this.y = y;
    }
    public void setX(float x)
    {
        this.x = x;
    }
}