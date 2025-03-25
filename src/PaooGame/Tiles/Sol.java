package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Sol extends Tile
    \brief Abstractizeaza notiunea de dala de tip sol.
 */
public class Sol extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Sol(int id)
    {
        super(Assets.sol, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
