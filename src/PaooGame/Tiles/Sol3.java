package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Sol3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip sol3.
 */
public class Sol3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Sol3(int id)
    {
        super(Assets.sol3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
