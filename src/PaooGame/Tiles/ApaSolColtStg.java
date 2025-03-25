package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class ApaSolColtStg extends Tile
    \brief Abstractizeaza notiunea de dala de tip apaSolColtStg.
 */
public class ApaSolColtStg extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ApaSolColtStg(int id)
    {
        super(Assets.apaSolColtStg, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }

}
