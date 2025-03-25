package PaooGame.Tiles;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/*! \class public class Tile
    \brief Retine toate dalele intr-un vector si ofera posibilitatea regasirii dupa un id.
 */
public class Tile
{
    private static final int NO_TILES   = 400; //id-uri pana la 300+
    public static Tile[] tiles          = new Tile[NO_TILES];       /*!< Vector de referinte de tipuri de dale.*/

        /// De remarcat ca urmatoarele dale sunt statice si publice. Acest lucru imi permite sa le am incarcate
        /// o singura data in memorie

    public static Tile fara                 = new Fara(0);

    //lvl 1
    public static Tile sol                  = new Sol(1);                /*!< Dala de tip sol*/
    public static Tile solIarbaColtStg      = new SolIarbaColtStg(2);    /*!< Dala de tip solIarbaColtStg*/
    public static Tile solIarbaColtDrt      = new SolIarbaColtDrt(3);    /*!< Dala de tip solIarbaColtDrt*/
    public static Tile solIarbaSus          = new SolIarbaSus(4);        /*!< Dala de tip solIarbaSus*/
    public static Tile iarbaColtDrt         = new IarbaColtDrt(5);       /*!< Dala de tip iarbaColtDrt*/
    public static Tile iarbaColtStg         = new IarbaColtStg(6);       /*!< Dala de tip iarbaColtStg*/
    public static Tile apaSolColtStg        = new ApaSolColtStg(7);      /*!< Dala de tip apaSolColtStg*/
    public static Tile apaSolColtDrt        = new ApaSolColtDrt(8);      /*!< Dala de tip apaSolColtDrt*/
    public static Tile apa                  = new Apa(9);                /*!< Dala de tip apa*/
    public static Tile apaColtStg           = new ApaColtStg(10);        /*!< Dala de tip apaColtStg*/
    public static Tile apaColtDrt           = new ApaColtDrt(11);        /*!< Dala de tip apaColtDrt*/
    public static Tile apaSolJos            = new ApaSolJos(12);         /*!< Dala de tip apaSolJos*/
    public static Tile solIarbaDrt          = new SolIarbaDrt(13);       /*!< Dala de tip solIarbaDrt*/
    public static Tile solIarbaStg          = new SolIarbaStg(14);       /*!< Dala de tip solIarbaStg*/
    public static Tile semiSol              = new SemiSol(15);           /*!< Dala de tip semiSol*/

    //accesorii lvl 1
    public static Tile floare               = new Floare(16);            /*!< Dala de tip floare*/
    public static Tile box                  = new Box(17);               /*!< Dala de tip box*/
    public static Tile usa                  = new Usa(18);               /*!< Dala de tip usa*/
    public static Tile copac                = new Copac(19);             /*!< Dala de tip copac*/
    public static Tile arbust               = new Arbust(20);            /*!< Dala de tip arbust*/

    //lvl 2
    public static Tile sol2                 = new Sol2(201);             /*!< Dala de tip sol2*/
    public static Tile solIarbaColtStg2     = new SolIarbaColtStg2(202); /*!< Dala de tip solIarbaColtStg2*/
    public static Tile solIarbaColtDrt2     = new SolIarbaColtDrt2(203); /*!< Dala de tip solIarbaColtDrt2*/
    public static Tile solIarbaSus2         = new SolIarbaSus2(204);      /*!< Dala de tip solIarbaSus2*/
    public static Tile iarbaColtDrt2        = new IarbaColtDrt2(205);     /*!< Dala de tip iarbaColtDrt2*/
    public static Tile iarbaColtStg2        = new IarbaColtStg2(206);     /*!< Dala de tip iarbaColtStg2*/
    public static Tile apaSolColtStg2       = new ApaSolColtStg2(207);    /*!< Dala de tip apaSolColtStg2*/
    public static Tile apaSolColtDrt2       = new ApaSolColtDrt2(208);    /*!< Dala de tip apaSolColtDrt2*/
    public static Tile apa2                 = new Apa2(209);              /*!< Dala de tip apa2*/
    public static Tile apaColtStg2          = new ApaColtStg2(210);       /*!< Dala de tip apaColtStg2*/
    public static Tile apaColtDrt2          = new ApaColtDrt2(211);       /*!< Dala de tip apaColtDrt2*/
    public static Tile apaSolJos2           = new ApaSolJos2(212);        /*!< Dala de tip apaSolJos2*/
    public static Tile solIarbaDrt2         = new SolIarbaDrt2(213);      /*!< Dala de tip solIarbaDrt2*/
    public static Tile solIarbaStg2         = new SolIarbaStg2(214);      /*!< Dala de tip solIarbaStg2*/
    public static Tile semiSol2             = new SemiSol2(215);          /*!< Dala de tip semiSol2*/

    //accesorii lvl 2
    public static Tile arbust2              = new Arbust2(270);           /*!< Dala de tip arbust2*/
    public static Tile om2                  = new Om2(271);               /*!< Dala de tip om2*/
    public static Tile tepi2                = new Tepi2(272);             /*!< Dala de tip tepi2*/
    public static Tile usa2                 = new Usa2(273);              /*!< Dala de tip usa2*/
    //lvl 3
    public static Tile sol3                 = new Sol3(301);               /*!< Dala de tip sol3*/
    public static Tile solIarbaColtStg3     = new SolIarbaColtStg3(302);   /*!< Dala de tip solIarbaColtStg3*/
    public static Tile solIarbaColtDrt3     = new SolIarbaColtDrt3(303);   /*!< Dala de tip solIarbaColtDrt3*/
    public static Tile solIarbaSus3         = new SolIarbaSus3(304);       /*!< Dala de tip solIarbaSus3*/
    public static Tile iarbaColtDrt3        = new IarbaColtDrt3(305);      /*!< Dala de tip iarbaColtDrt3*/
    public static Tile iarbaColtStg3        = new IarbaColtStg3(306);      /*!< Dala de tip iarbaColtStg3*/
    public static Tile apaSolColtStg3       = new ApaSolColtStg3(307);     /*!< Dala de tip apaSolColtStg3*/
    public static Tile apaSolColtDrt3       = new ApaSolColtDrt3(308);     /*!< Dala de tip apaSolColtDrt3*/
    public static Tile apa3                 = new Apa3(309);               /*!< Dala de tip apa3*/
    public static Tile apaColtStg3          = new ApaColtStg3(310);        /*!< Dala de tip apaColtStg3*/
    public static Tile apaColtDrt3          = new ApaColtDrt3(311);        /*!< Dala de tip apaColtDrt3*/
    public static Tile apaSolJos3           = new ApaSolJos3(312);         /*!< Dala de tip apaSolJos3*/
    public static Tile solIarbaDrt3         = new SolIarbaDrt3(313);       /*!< Dala de tip solIarbaDrt3*/
    public static Tile solIarbaStg3         = new SolIarbaStg3(314);       /*!< Dala de tip solIarbaStg3*/
    public static Tile semiSol3             = new SemiSol3(315);           /*!< Dala de tip semiSol3*/

    //accesorii lvl 3
    public static Tile usa3                 = new Usa3(371);               /*!< Dala de tip usa3*/
    public static Tile box3                 = new Box3(372);               /*!< Dala de tip box3*/
    public static Tile tepi3                = new Tepi3(373);              /*!< Dala de tip tepi3*/
    public static Tile turturi3             = new Turturi3(374);           /*!< Dala de tip turturi3*/
    public static Tile brad3                = new Brad3(375);              /*!< Dala de tip brad3*/
    public static Tile om3                  = new Om3(376);                /*!< Dala de tip om3*/

    public Rectangle tileBounds;

    public static final int TILE_WIDTH  = 64;                                  /*!< Latimea unei dale.*/
    public static final int TILE_HEIGHT = 64;                                  /*!< Inaltimea unei dale.*/

    protected BufferedImage img;                                               /*!< Imaginea aferenta tipului de dala.*/
    protected final int id;                                                    /*!< Id-ul unic aferent tipului de dala.*/

    /*! \fn public Tile(BufferedImage texture, int id)
        \brief Constructorul aferent clasei.

        \param image Imaginea corespunzatoare dalei.
        \param id Id-ul dalei.
     */
    public Tile(BufferedImage image, int idd)
    {
        img = image;
        id = idd;
        tileBounds = new Rectangle(0, 0, TILE_WIDTH, Tile.TILE_HEIGHT);
        tiles[id] = this;
       // tileBounds.y = TILE_HEIGHT / 2;
       // tileBounds.height = TILE_HEIGHT / 2;
    }

    /*! \fn public void Update()
        \brief Actualizeaza proprietatile dalei.
     */
    public void Update()
    {

    }

    /*! \fn public void Draw(Graphics g, int x, int y)
        \brief Deseneaza in fereastra dala.

        \param g Contextul grafic in care sa se realizeze desenarea
        \param x Coordonata x in cadrul ferestrei unde sa fie desenata dala
        \param y Coordonata y in cadrul ferestrei unde sa fie desenata dala
     */
    public void Draw(Graphics g, int x, int y)
    {
            /// Desenare dala
        g.drawImage(img, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }

    /*! \fn public boolean IsSolid()
        \brief Returneaza proprietatea de dala solida (supusa coliziunilor) sau nu.
     */
    public boolean IsSolid()
    {
        return false;
    }
    public boolean IsBad() {return false; }
}
