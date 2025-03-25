package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class ApaColtDrt extends Tile
    \brief Abstractizeaza notiunea de dala de tip ApaColtDrt.
 */
public class ApaColtDrt extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ApaColtDrt(int id)
    {
        super(Assets.apaColtDrt, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }

}

