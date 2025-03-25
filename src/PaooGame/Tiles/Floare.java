package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Floare extends Tile
    \brief Abstractizeaza notiunea de dala de tip floare.
 */
public class Floare extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Floare(int id)
    {
        super(Assets.floare, id);
    }
    @Override
    public boolean IsSolid()
    {
        return  false;
    }
    @Override
    public boolean IsBad() {return false; }
}
