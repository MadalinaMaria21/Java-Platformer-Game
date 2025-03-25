package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaStg3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip solIarbaStg3.
 */
public class SolIarbaStg3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaStg3(int id)
    {
        super(Assets.solIarbaStg3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
