package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Usa extends Tile
    \brief Abstractizeaza notiunea de dala de tip usa.
 */
public class Usa extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Usa(int id)
    {
        super(Assets.usa, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return false; }
}
