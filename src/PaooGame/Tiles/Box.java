package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Box extends Tile
    \brief Abstractizeaza notiunea de dala de tip  box.
 */
public class Box extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Box(int id)
    {
        super(Assets.box, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
