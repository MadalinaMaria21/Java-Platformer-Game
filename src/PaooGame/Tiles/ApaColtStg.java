package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class ApaColtStg extends Tile
    \brief Abstractizeaza notiunea de dala de tip apaColtStg.
 */
public class ApaColtStg extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ApaColtStg(int id)
    {
        super(Assets.apaColtStg, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }

}

