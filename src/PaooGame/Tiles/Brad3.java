package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Brad3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip brad3.
 */
public class Brad3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Brad3(int id)
    {
        super(Assets.brad3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return false;}
}

