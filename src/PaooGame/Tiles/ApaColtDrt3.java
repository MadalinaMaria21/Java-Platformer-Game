package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class ApaColtDrt3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip apaColtDrt3.
 */
public class ApaColtDrt3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ApaColtDrt3(int id)
    {
        super(Assets.apaColtDrt3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }

}

