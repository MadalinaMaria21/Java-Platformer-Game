package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Box3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip box3.
 */
public class Box3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Box3(int id)
    {
        super(Assets.box3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
    @Override
    public boolean IsBad() {return false; }
}
