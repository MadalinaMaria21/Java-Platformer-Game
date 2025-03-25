package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class ApaSolColtDrt2 extends Tile
    \brief Abstractizeaza notiunea de dala de tip apaSolColtDrt2.
 */
public class ApaSolColtDrt2 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ApaSolColtDrt2(int id)
    {
        super(Assets.apaSolColtDrt2, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }

}

