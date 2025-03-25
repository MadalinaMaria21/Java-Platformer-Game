package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class IarbaColtStg3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip iarbaColtStg3.
 */
public class IarbaColtStg3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public IarbaColtStg3(int id)
    {
        super(Assets.iarbaColtStg3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
