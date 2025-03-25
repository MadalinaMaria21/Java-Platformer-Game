package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaDrt2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip solIarbaDrt2.
 */
public class SolIarbaDrt2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaDrt2(int id)
    {
        super(Assets.solIarbaDrt2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}

