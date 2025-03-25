package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Apa3 extends Tile
    \brief Abstractizeaza notiunea de dala de tip apa3.
 */
public class Apa3 extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Apa3(int id)
    {
        super(Assets.apa3, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }

}
