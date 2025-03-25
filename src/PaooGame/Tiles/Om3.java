package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Om3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip om3.
 */
public class Om3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Om3(int id)
    {
        super(Assets.om3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return false; }
}

