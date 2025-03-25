package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Sol2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip sol2.
 */
public class Sol2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Sol2(int id)
    {
        super(Assets.sol2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
