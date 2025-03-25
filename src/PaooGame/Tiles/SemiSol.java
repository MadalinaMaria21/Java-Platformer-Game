package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SemiSol extends Tile
    \brief Abstractizeaza notiunea de dala de tip semiSol.
 */
public class SemiSol extends Tile {
    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public SemiSol(int id)
    {
        super(Assets.semiSol, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
        //int tileY = tileBounds.y; // Coordonata Y a dalei în cadrul ferestrei de desenare
        //return tileY <= SOLID_AREA_HEIGHT;
    }
    @Override
    public boolean IsBad() {return false; }
}
