package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class ApaSolJos extends Tile
    \brief Abstractizeaza notiunea de dala de tip apaSolJos.
 */
public class ApaSolJos extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ApaSolJos(int id)
    {
        super(Assets.apaSolJos, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }

    @Override
    public boolean IsBad() {return true; }
}

