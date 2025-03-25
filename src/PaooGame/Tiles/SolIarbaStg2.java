package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaStg2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip  solIarbaStg2.
 */
public class SolIarbaStg2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaStg2(int id)
    {
        super(Assets.solIarbaStg2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
