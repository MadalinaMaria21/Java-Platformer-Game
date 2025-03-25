package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class IarbaColtDrt extends Tile
    \brief Abstractizeaza notiunea de dala de tip iarbaColtDrt.
 */
public class IarbaColtDrt extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public IarbaColtDrt(int id) {
        super(Assets.iarbaColtDrt, id);
    }

    @Override
    public boolean IsSolid() {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
    /*public boolean IsSolid()
    {
        int tileSize = 48;
        int left = img.getWidth() / tileSize;
        int top = img.getHeight() / tileSize;

        // colturile triunghiului inferior
        int bottomLeftX = left * tileSize;
        int bottomLeftY = (top + 1) * tileSize;

        int bottomRightX = (left + 1) * tileSize;
        int bottomRightY = (top + 1) * tileSize;

        // pozitia punctului
        int pointX = img.getWidth() + tileSize / 2;
        int pointY = img.getHeight() + tileSize / 2;

        // calculam produsul vectorial
        int vectorProduct = (bottomRightX - bottomLeftX) * (pointY - bottomLeftY) -
                (pointX - bottomLeftX) * (bottomRightY - bottomLeftY);

        return vectorProduct < 0;
        //return true;
    }

}*/
