package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class Fara extends Tile
    \brief Abstractizeaza notiunea de dala de tip fara.
 */
public class Fara extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Fara(int id)
    {
        super(Assets.fara, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return false; }
}

