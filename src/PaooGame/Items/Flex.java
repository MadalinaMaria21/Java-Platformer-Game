package PaooGame.Items;
import PaooGame.Graphics.Assets;
import PaooGame.RefLinks;
import java.awt.*;
import java.awt.image.BufferedImage;
/*! \class public class Flex extends Item
    \brief Defineste notiunea de obiect mortal, flex.
*/
public class Flex extends Item{
    private BufferedImage image;
   private int nrfps = 0;  //pt numaratoare
    public Flex(RefLinks refLink,float x, float y, int width, int height) //constructor
    {
        super(refLink, x, y, width, height);
        image                       = Assets.flex1;
        this.normalBounds.x         = (int) (x) + 16;
        this.normalBounds.y         = (int) (y) + 16;
        this.normalBounds.width     = 32;
        this.normalBounds.height    = 32;
    }
    @Override
    public void Update() {
        if(nrfps % 20 == 0) //ca sa schimbe sprite ul de 3 ori pre secunda
            image = Assets.flex2;
        else
            image = Assets.flex1;
        nrfps++;
        //actualizeaza x si y in functie de coordonatele camerei
        normalBounds.x = (int)(x-refLink.GetGame().GetCamera().GetX()+16);
        normalBounds.y = (int)(y-refLink.GetGame().GetCamera().GetY()+16);
    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(image, (int) (x - refLink.GetGame().GetCamera().GetX()), (int) (y - refLink.GetGame().GetCamera().GetY()), width, height, null);
    }
}
