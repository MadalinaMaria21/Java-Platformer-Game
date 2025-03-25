package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaSus extends Tile
    \brief Abstractizeaza notiunea de dala de tip solIarbaSus.
 */
public class SolIarbaSus extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaSus(int id)
    {
        super(Assets.solIarbaSus, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}

