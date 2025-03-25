package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class ApaColtStg2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip apaColtStg2.
 */
public class ApaColtStg2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ApaColtStg2(int id)
    {
        super(Assets.apaColtStg2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }

}

