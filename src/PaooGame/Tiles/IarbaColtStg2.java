package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class IarbaColtStg2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip iarbaColtStg2.
 */
public class IarbaColtStg2 extends Tile {
    public IarbaColtStg2(int id)
    {
        super(Assets.iarbaColtStg2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
