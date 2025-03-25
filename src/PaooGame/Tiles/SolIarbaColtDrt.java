package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaColtDrt extends Tile
    \brief Abstractizeaza notiunea de dala de tip solIarbaColtDrt.
 */
public class SolIarbaColtDrt extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaColtDrt(int id)
    {
        super(Assets.solIarbaColtDrt, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
