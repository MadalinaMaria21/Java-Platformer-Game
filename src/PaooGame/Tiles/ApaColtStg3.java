package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class ApaColtStg3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip apaColtStg3.
 */
public class ApaColtStg3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ApaColtStg3(int id)
    {
        super(Assets.apaColtStg3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }

}

