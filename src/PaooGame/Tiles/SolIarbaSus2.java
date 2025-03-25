package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaSus2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip solIarbaSus2.
 */
public class SolIarbaSus2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaSus2(int id)
    {
        super(Assets.solIarbaSus2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}

