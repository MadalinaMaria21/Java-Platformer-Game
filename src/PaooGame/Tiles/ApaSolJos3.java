package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class ApaSolJos3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip  apaSolJos3.
 */
public class ApaSolJos3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ApaSolJos3(int id)
    {
        super(Assets.apaSolJos3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }
}

