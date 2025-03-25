package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Tepi2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip tepi2.
 */
public class Tepi2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Tepi2(int id)
    {
        super(Assets.tepi2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }
}

