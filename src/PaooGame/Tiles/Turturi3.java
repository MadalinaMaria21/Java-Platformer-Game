package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Turturi3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip turturi3.
 */
public class Turturi3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Turturi3(int id)
    {
        super(Assets.turturi3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }
}
