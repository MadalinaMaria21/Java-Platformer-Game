package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaDrt extends Tile
    \brief Abstractizeaza notiunea de dala de tip solIarbaDrt.
 */
public class SolIarbaDrt extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaDrt(int id)
    {
        super(Assets.solIarbaDrt, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}

