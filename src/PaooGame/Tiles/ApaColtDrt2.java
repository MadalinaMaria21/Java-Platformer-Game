package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class ApaColtDrt2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip ApaColtDrt2.
 */
public class ApaColtDrt2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ApaColtDrt2(int id)
    {
        super(Assets.apaColtDrt2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }

}

