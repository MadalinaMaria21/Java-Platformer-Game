package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaColtStg extends Tile
    \brief Abstractizeaza notiunea de dala de tip solIarbaColtStg.
 */
public class SolIarbaColtStg extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaColtStg(int id)
    {
        super(Assets.solIarbaColtStg, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
