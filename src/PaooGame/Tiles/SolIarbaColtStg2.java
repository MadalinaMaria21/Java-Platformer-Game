package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaColtStg2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip solIarbaColtStg2.
 */
public class SolIarbaColtStg2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaColtStg2(int id)
    {
        super(Assets.solIarbaColtStg2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
