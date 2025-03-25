package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Apa extends Tile
    \brief Abstractizeaza notiunea de dala de tip apa.
 */
public class Apa extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Apa(int id)
    {
        super(Assets.apa, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return true; }


}
