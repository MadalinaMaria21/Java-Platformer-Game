package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Arbust extends Tile
    \brief Abstractizeaza notiunea de dala de tip arbust.
 */
public class Arbust extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Arbust(int id)
    {
        super(Assets.arbust, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return false; }
}

