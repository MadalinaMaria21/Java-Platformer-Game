package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SemiSol3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip semiSol3.
 */
public class SemiSol3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SemiSol3(int id)
    {
        super(Assets.semiSol3, id);
    }
    @Override
    public boolean IsSolid()
    {

        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
