package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class ApaSolColtDrt extends Tile
    \brief Abstractizeaza notiunea de dala de tip  apaSolColtDrt.
 */
public class ApaSolColtDrt extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ApaSolColtDrt(int id)
    {
        super(Assets.apaSolColtDrt, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }

}

