package PaooGame.Items;

import PaooGame.Graphics.Assets;
import PaooGame.Levels.Level1;
import PaooGame.Levels.Level2;
import PaooGame.Levels.Level3;
import PaooGame.RefLinks;

import java.awt.*;
import java.awt.image.BufferedImage;
/*! \class public class Dinte extends Item
    \brief Defineste notiunea de dinte, obiect care trebuie ulterior colectat.
*/

public class Dinte extends Item{
    private BufferedImage           image;
    private boolean                 colected;
    public Dinte(RefLinks refLink, float x, float y, int width, int height) { //constructor
        super(refLink, x, y, width, height);
        image                       = Assets.dinte_galben;
        this.normalBounds.x         = (int) (x) + 16;
        this.normalBounds.y         = (int) (y) + 16;
        this.normalBounds.width     = 32;
        this.normalBounds.height    = 32;
        colected                    = false;
    }

    @Override
    public void Update() {
        //seteaza imaginea dintelui in functie de nivel
        if(refLink.GetGame().getPlayState().GetLevel() instanceof Level1)
            image = Assets.dinte_galben;
        else if(refLink.GetGame().getPlayState().GetLevel() instanceof Level2)
            image = Assets.dinte_albastru;
        else if(refLink.GetGame().getPlayState().GetLevel() instanceof Level3)
            image = Assets.dinte_mov;
        //incrementeaza scorul
        if(!colected)
            if(refLink.GetGame().getPlayState().getHero().getNormalBounds().intersects(normalBounds)) {
                colected = true;
                refLink.GetGame().getPlayState().GetScore().AddScore();
             }
        //actualizeaza pozitia in functie de camera
        normalBounds.x = (int)(x-refLink.GetGame().GetCamera().GetX()+16);
        normalBounds.y = (int)(y-refLink.GetGame().GetCamera().GetY()+16);
    }

    @Override
    public void Draw(Graphics g) {
        if(!colected) {
            g.drawImage(image, (int) (x - refLink.GetGame().GetCamera().GetX()), (int) (y - refLink.GetGame().GetCamera().GetY()), width, height, null);
        }
    }
}
