package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaColtStg3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip solIarbaColtStg3.
 */
public class SolIarbaColtStg3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaColtStg3(int id)
    {
        super(Assets.solIarbaColtStg3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
