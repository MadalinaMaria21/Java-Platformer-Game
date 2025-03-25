package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaColtDrt2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip solIarbaColtDrt2.
 */
public class SolIarbaColtDrt2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaColtDrt2(int id)
    {
        super(Assets.solIarbaColtDrt2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
