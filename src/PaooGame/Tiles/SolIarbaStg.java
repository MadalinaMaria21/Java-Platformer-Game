package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SolIarbaStg extends Tile
    \brief Abstractizeaza notiunea de dala de tip solIarbaStg.
 */
public class SolIarbaStg extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SolIarbaStg(int id)
    {
        super(Assets.solIarbaStg, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
