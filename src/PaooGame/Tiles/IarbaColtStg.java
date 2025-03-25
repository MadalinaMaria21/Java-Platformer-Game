package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class IarbaColtStg extends Tile
    \brief Abstractizeaza notiunea de dala de tip iarbaColtStg.
 */
public class IarbaColtStg extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public IarbaColtStg(int id)
    {
        super(Assets.iarbaColtStg, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
