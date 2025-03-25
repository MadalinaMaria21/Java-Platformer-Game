package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class  Copac extends Tile
    \brief Abstractizeaza notiunea de dala de tip  copac.
 */
public class Copac extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Copac(int id)
    {
        super(Assets.copac, id);
    }
    @Override
    public boolean IsSolid()
    {
        return false;
    }
    @Override
    public boolean IsBad() {return false; }
}

