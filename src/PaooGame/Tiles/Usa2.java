package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Usa2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip usa2.
 */
public class Usa2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Usa2(int id)
    {
        super(Assets.usa2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return false; }
}

