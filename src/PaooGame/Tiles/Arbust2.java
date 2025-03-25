package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Arbust2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip arbust2.
 */
public class Arbust2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Arbust2(int id)
    {
        super(Assets.arbust2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return false; }
}

