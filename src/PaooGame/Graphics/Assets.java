package PaooGame.Graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
    //Clasa incarca fiecare element grafic necesar jocului.
    //Game assets include tot ce este folosit intr-un joc: imagini, sunete, harti etc.
public class Assets
{
    // Referinte catre elementele grafice (dale) utilizate in joc.
    // background
    public static BufferedImage backgroundLevel1;
    public static BufferedImage backgroundLevel2;
    public static BufferedImage backgroundLevel3;

    //pentru vectorii cu sprite uri
    public static BufferedImage image;

    // pt Level1
    public static BufferedImage [] heroRunLeft      = new BufferedImage[10];
    public static BufferedImage [] heroRunRight     = new BufferedImage[10];
    public static BufferedImage [] heroIdle         = new BufferedImage[10];
    public static BufferedImage [] heroGift         = new BufferedImage[10];
    public static BufferedImage [] heroJumpLeft     = new BufferedImage[10];
    public static BufferedImage [] heroJumpRight    = new BufferedImage[10];

    // pt Level2
    public static BufferedImage [] heroRunLeft2     = new BufferedImage[10];
    public static BufferedImage [] heroRunRight2    = new BufferedImage[10];
    public static BufferedImage [] heroIdle2        = new BufferedImage[10];
    public static BufferedImage [] heroGift2        = new BufferedImage[10];
    public static BufferedImage [] heroJumpLeft2    = new BufferedImage[10];
    public static BufferedImage [] heroJumpRight2   = new BufferedImage[10];

    // pt Level3
    public static BufferedImage [] heroRunLeft3     = new BufferedImage[10];
    public static BufferedImage [] heroRunRight3    = new BufferedImage[10];
    public static BufferedImage [] heroIdle3        = new BufferedImage[10];
    public static BufferedImage [] heroGift3        = new BufferedImage[10];
    public static BufferedImage [] heroJumpLeft3    = new BufferedImage[10];
    public static BufferedImage [] heroJumpRight3   = new BufferedImage[10];

    public static BufferedImage [] monsterLeft      = new BufferedImage[18];
    public static BufferedImage [] monsterRight     = new BufferedImage[18];

    //pt dale Level1
    public static BufferedImage fara;                   //id = 0

    public static BufferedImage sol;                    //id = 1
    public static BufferedImage solIarbaColtStg;        //id = 2
    public static BufferedImage solIarbaColtDrt;        //id = 3
    public static BufferedImage solIarbaSus;            //id = 4
    public static BufferedImage iarbaColtDrt;           // id = 5
    public static BufferedImage iarbaColtStg;           //id = 6
    public static BufferedImage apaSolColtStg;          //id = 7
    public static BufferedImage apaSolColtDrt;          //id = 8
    public static BufferedImage apa;                    //id = 9
    public static BufferedImage apaColtStg;             //id = 10
    public static BufferedImage apaColtDrt;             //id = 11
    public static BufferedImage apaSolJos;              //id = 12
    public static BufferedImage solIarbaDrt;            //id = 13
    public static BufferedImage solIarbaStg;            //id = 14
    public static BufferedImage semiSol;                //id = 15

    //pt dale Level2
    public static BufferedImage sol2;                   //id = 201
    public static BufferedImage solIarbaColtStg2;       //id = 202
    public static BufferedImage solIarbaColtDrt2;       //id = 203
    public static BufferedImage solIarbaSus2;           //id = 204
    public static BufferedImage iarbaColtDrt2;          // id = 205
    public static BufferedImage iarbaColtStg2;          //id = 206
    public static BufferedImage apaSolColtStg2;         //id = 207
    public static BufferedImage apaSolColtDrt2;         //id = 208
    public static BufferedImage apa2;                   //id = 209
    public static BufferedImage apaColtStg2;            //id = 210
    public static BufferedImage apaColtDrt2;            //id = 211
    public static BufferedImage apaSolJos2;             //id = 212
    public static BufferedImage solIarbaDrt2;           //id = 213
    public static BufferedImage solIarbaStg2;           //id = 214
    public static BufferedImage semiSol2;               //id = 215

    //pt dale Level3
    public static BufferedImage sol3;                   //id = 301
    public static BufferedImage solIarbaColtStg3;       //id = 302
    public static BufferedImage solIarbaColtDrt3;       //id = 303
    public static BufferedImage solIarbaSus3;           //id = 304
    public static BufferedImage iarbaColtDrt3;          // id = 305
    public static BufferedImage iarbaColtStg3;          //id = 306
    public static BufferedImage apaSolColtStg3;         //id = 307
    public static BufferedImage apaSolColtDrt3;         //id = 308
    public static BufferedImage apa3;                   //id = 309
    public static BufferedImage apaColtStg3;            //id = 310
    public static BufferedImage apaColtDrt3;            //id = 311
    public static BufferedImage apaSolJos3;             //id = 312
    public static BufferedImage solIarbaDrt3;           //id = 313
    public static BufferedImage solIarbaStg3;           //id = 314
    public static BufferedImage semiSol3;               //id = 315

    // pt accesorii 1+2+3
    public static BufferedImage floare;                 //id = 16
    public static BufferedImage box;                    //id = 17
    public static BufferedImage usa;                    //id = 18
    public static BufferedImage arbust;                 //id = 19
    public static BufferedImage copac;                  //id = 20

    public static BufferedImage arbust2;                //id = 270
    public static BufferedImage om2;                    //id = 271
    public static BufferedImage tepi2;                  //id = 272
    public static BufferedImage usa2;                   //id=273

    public static BufferedImage usa3;                   //id=371
    public static BufferedImage box3;                   //id=372
    public static BufferedImage tepi3;                  //id=373
    public static BufferedImage turturi3;               //id=374
    public  static BufferedImage brad3;                 //id=375
    public static BufferedImage om3;                    //id=376
    public static BufferedImage flex1;
    public static BufferedImage flex2;


    // pt dinti
    public static BufferedImage dinte_galben;
    public static BufferedImage dinte_albastru;
    public static BufferedImage dinte_mov;
    //pt menu state
    public static BufferedImage menuBkgrd;
    public static BufferedImage storyBkgrd;
    public static BufferedImage infoBkgrd;
    public static BufferedImage scoreBkgrd;
    public static BufferedImage winBkgrd;
    public static BufferedImage loseBkgrd;
    public static BufferedImage scoreTable1;
    public static BufferedImage scoreTable2;
    public static BufferedImage scoreTable3;

    // Functia initializaza referintele catre elementele grafice utilizate.

    public static void Init() {
            /// Se creaza temporar un obiect SpriteSheet initializat prin intermediul clasei ImageLoader

        SpriteSheet sheet  = new SpriteSheet(ImageLoader.LoadImage("/textures/TileSpriteSheet.png"));
        SpriteSheet sheet2 = new SpriteSheet(ImageLoader.LoadImage("/textures/TileSpriteSheet2.png"));
        SpriteSheet sheet3 = new SpriteSheet(ImageLoader.LoadImage("/textures/TileSpriteSheet3.png"));

        SpriteSheet sheetAccesorii  = new SpriteSheet(ImageLoader.LoadImage("/textures/AccesoriiVaraSpriteSheet.png"));
        SpriteSheet sheetAccesorii2 = new SpriteSheet(ImageLoader.LoadImage("/textures/AccesoriiToamnaSpriteSheet.png"));
        SpriteSheet sheetAccesorii3 = new SpriteSheet(ImageLoader.LoadImage("/textures/AccesoriiIarnaSpriteSheet.png"));

        SpriteSheet dinti = new SpriteSheet(ImageLoader.LoadImage("/textures/SpriteSheetDinti.png"));
        SpriteSheet flex = new SpriteSheet(ImageLoader.LoadImage("/textures/flex.png"));
        // Se obtin subimaginile corespunzatoare elementelor necesare.
        // incarcare tile Level1
        fara                = sheet.crop(3, 3);
        sol                 = sheet.crop(0,0 );
        solIarbaColtStg     = sheet.crop(1, 0);
        solIarbaSus         = sheet.crop(2, 0);
        solIarbaColtDrt     = sheet.crop(3, 0);
        iarbaColtDrt        = sheet.crop(0, 1);
        iarbaColtStg        = sheet.crop(1, 1);
        apaSolColtStg       = sheet.crop(2, 1);
        apaSolColtDrt       = sheet.crop(3, 1);
        apa                 = sheet.crop(0, 2);
        apaColtStg          = sheet.crop(1, 2);
        apaSolJos           = sheet.crop(2, 2);
        apaColtDrt          = sheet.crop(3, 2);
        solIarbaStg         = sheet.crop(0, 3);
        solIarbaDrt         = sheet.crop(1, 3);
        semiSol             = sheet.crop(2,3);
        //incarcare tile level2
        sol2                = sheet2.crop(0,0 );
        solIarbaColtStg2    = sheet2.crop(1, 0);
        solIarbaSus2        = sheet2.crop(2, 0);
        solIarbaColtDrt2    = sheet2.crop(3, 0);
        iarbaColtDrt2       = sheet2.crop(0, 1);
        iarbaColtStg2       = sheet2.crop(1, 1);
        apaSolColtStg2      = sheet2.crop(2, 1);
        apaSolColtDrt2      = sheet2.crop(3, 1);
        apa2                = sheet2.crop(0, 2);
        apaColtStg2         = sheet2.crop(1, 2);
        apaSolJos2          = sheet2.crop(2, 2);
        apaColtDrt2         = sheet2.crop(3, 2);
        solIarbaStg2        = sheet2.crop(0, 3);
        solIarbaDrt2        = sheet2.crop(1, 3);
        semiSol2            = sheet2.crop(2,3);
        //incarcare tile level3
        sol3                = sheet3.crop(0,0 );
        solIarbaColtStg3    = sheet3.crop(1, 0);
        solIarbaSus3        = sheet3.crop(2, 0);
        solIarbaColtDrt3    = sheet3.crop(3, 0);
        iarbaColtDrt3       = sheet3.crop(0, 1);
        iarbaColtStg3       = sheet3.crop(1, 1);
        apaSolColtStg3      = sheet3.crop(2, 1);
        apaSolColtDrt3      = sheet3.crop(3, 1);
        apa3                = sheet3.crop(0, 2);
        apaColtStg3         = sheet3.crop(1, 2);
        apaSolJos3          = sheet3.crop(2, 2);
        apaColtDrt3         = sheet3.crop(3, 2);
        solIarbaStg3        = sheet3.crop(0, 3);
        solIarbaDrt3        = sheet3.crop(1, 3);
        semiSol3            = sheet3.crop(2,3);
        //incarcare accesorii level1
        box            = sheetAccesorii.crop(0,0,300,300);
        usa            = sheetAccesorii.crop(300,0,205,300);
        copac          = sheetAccesorii.crop(505,0,284,300);
        arbust         = sheetAccesorii.crop(789,0,297,300);
        floare         = sheetAccesorii.crop(1086,0,194,300);
        dinte_galben   = dinti.crop(0,0,350,350);
        dinte_albastru = dinti.crop(350,0,350,350);
        dinte_mov      = dinti.crop(700,0,350,350);

        //incarcare accesorii level2
        arbust2        = sheetAccesorii2.crop(0,0,417,300);
        om2            = sheetAccesorii2.crop(417,0,192,300);
        tepi2          = sheetAccesorii2.crop(609,0,1300,300);
        usa2           = sheetAccesorii2.crop(609+1579,0,205,300);

        //incarcare accesorii level3
        box3           = sheetAccesorii3.crop(0, 0, 502, 500);
        usa3           = sheetAccesorii3.crop(1003,0,342,500);
        om3            = sheetAccesorii3.crop(1345,0,361,500);
        tepi3          = sheetAccesorii3.crop(1706,0,800,500);
        turturi3       = sheetAccesorii3.crop(2992,0,720,500);
        brad3          = sheetAccesorii3.crop(4278,0,350,500);
        flex1          = flex.crop(0,0,501,500);
        flex2          = flex.crop(501,0,501,500);

        ///////////////////////////////////////////level1--Kaira///////////////////////////////////////////////////////////////////////////
        //incarcare imagini run1
        SpriteSheet run1  = new SpriteSheet(ImageLoader.LoadImage("/textures/SummerRunSprite.png"));
        for(int i = 0; i < heroRunLeft.length; i++)
            heroRunLeft[i] = run1.crop(i*617, 0*810, 617, 810); //getSubimage metoda din BufferImage
        for(int i = 0; i < heroRunRight.length; i++)
            heroRunRight[i] = run1.crop(i*617, 1*810, 617, 810);//getSubimage metoda din BufferImage

        //incarcare imagini jump1
        SpriteSheet jump1  = new SpriteSheet(ImageLoader.LoadImage("/textures/SummerJumpSprite.png"));
        for(int i = 0; i < heroJumpLeft.length; i++)
            heroJumpLeft[i] = jump1.crop(i*585, 0*897, 585, 897);   //getSubimage metoda din BufferImage
        for(int i = 0; i < heroJumpRight.length; i++)
            heroJumpRight[i] = jump1.crop(i*585, 1*897, 585, 897);   //getSubimage metoda din BufferImage

        //incarcare imagini idle1
        SpriteSheet idle1  = new SpriteSheet(ImageLoader.LoadImage("/textures/SummerIdleSprite.png"));
        for(int i = 0; i < heroIdle.length; i++)
            heroIdle[i] = idle1.crop(i*603, 0*785, 603, 785);   //getSubimage metoda din BufferImage

        //incarcare imagini gift1
        SpriteSheet gift1  = new SpriteSheet(ImageLoader.LoadImage("/textures/SummerGiftSprite.png"));
        for(int i = 0; i < heroGift.length; i++)
            heroGift[i] = gift1.crop(i*759, 0*902, 759, 902);    //getSubimage metoda din BufferImage

        ///////////////////////////////////////////level2--Kaira///////////////////////////////////////////////////////////////////////////
        //incarcare imagini run2
        SpriteSheet run2  = new SpriteSheet(ImageLoader.LoadImage("/textures/AutumnRunSprite.png"));
        for(int i = 0; i < heroRunLeft2.length; i++)
            heroRunLeft2[i] = run2.crop(i*456, 0*796, 456, 796); //getSubimage metoda din BufferImage
        for(int i = 0; i < heroRunRight2.length; i++)
            heroRunRight2[i] = run2.crop(i*456, 1*796, 456, 796);//getSubimage metoda din BufferImage

        //incarcare imagini jump2
        SpriteSheet jump2  = new SpriteSheet(ImageLoader.LoadImage("/textures/AutumnJumpSprite.png"));
        for(int i = 0; i < heroJumpLeft2.length; i++)
            heroJumpLeft2[i] = jump2.crop(i*432, 0*871, 432, 871);   //getSubimage metoda din BufferImage
        for(int i = 0; i < heroJumpRight2.length; i++)
            heroJumpRight2[i] = jump2.crop(i*432, 1*871, 432, 871);   //getSubimage metoda din BufferImage

        //incarcare imagini idle2
        SpriteSheet idle2  = new SpriteSheet(ImageLoader.LoadImage("/textures/AutumnIdleSprite.png"));
        for(int i = 0; i < heroIdle2.length; i++)
            heroIdle2[i] = idle2.crop(i*434, 0, 434, 762);   //getSubimage metoda din BufferImage

        //incarcare imagini gift2
        SpriteSheet gift2  = new SpriteSheet(ImageLoader.LoadImage("/textures/AutumnGiftSprite.png"));
        for(int i = 0; i < heroGift2.length; i++)
            heroGift2[i] = gift2.crop(i*759, 0*901, 759, 901);    //getSubimage metoda din BufferImage

        ///////////////////////////////////////////level3--Kaira///////////////////////////////////////////////////////////////////////////
        //incarcare imagini run3
        SpriteSheet run3  = new SpriteSheet(ImageLoader.LoadImage("/textures/WinterRunSprite.png"));
        for(int i = 0; i < heroRunLeft3.length; i++)
            heroRunLeft3[i] = run3.crop(i*543, 0*767, 543, 767); //getSubimage metoda din BufferImage
        for(int i = 0; i < heroRunRight3.length; i++)
            heroRunRight3[i] = run3.crop(i*543, 1*767, 543, 767);//getSubimage metoda din BufferImage

        //incarcare imagini jump3
        SpriteSheet jump3  = new SpriteSheet(ImageLoader.LoadImage("/textures/WinterJumpSprite.png"));
        for(int i = 0; i < heroJumpLeft3.length; i++)
            heroJumpLeft3[i] = jump3.crop(i*513, 0*840, 513, 840);   //getSubimage metoda din BufferImage
        for(int i = 0; i < heroJumpRight3.length; i++)
            heroJumpRight3[i] = jump3.crop(i*513, 1*840, 513, 840);   //getSubimage metoda din BufferImage

        //incarcare imagini idle3
        SpriteSheet idle3  = new SpriteSheet(ImageLoader.LoadImage("/textures/WinterIdleSprite.png"));
        for(int i = 0; i < heroIdle3.length; i++)
            heroIdle3[i] = idle3.crop(i*518, 0*732, 518, 732);   //getSubimage metoda din BufferImage

        //incarcare imagini gift3
        SpriteSheet gift3  = new SpriteSheet(ImageLoader.LoadImage("/textures/WinterGiftSprite.png"));
        for(int i = 0; i < heroGift3.length; i++)
            heroGift3[i] = gift3.crop(i*759, 0*902, 759, 902);    //getSubimage metoda din BufferImage

        ///////////////////////////////////////////////////level3--SIK///////////////////////////////////////////////////////////////////////////
        SpriteSheet monster  = new SpriteSheet(ImageLoader.LoadImage("/textures/MonsterSprite.png"));
        for(int i = 0; i < monsterLeft.length; i++)
            monsterLeft[i] = monster.crop(i * 372, 0 * 374, 372, 374);    //getSubimage metoda din BufferImage
        for(int i = 0; i < monsterRight.length; i++)
            monsterRight[i] = monster.crop(i * 372, 1 * 374, 372, 374);    //getSubimage metoda din BufferImage



        menuBkgrd   = ImageLoader.LoadImage("/textures/InterfaceMenu.png");
        storyBkgrd  = ImageLoader.LoadImage("/textures/InterfaceMenu1.png");
        scoreBkgrd  = ImageLoader.LoadImage("/textures/InterfaceMenu2.png");
        infoBkgrd   = ImageLoader.LoadImage("/textures/InterfaceMenu3.png");
        winBkgrd    = ImageLoader.LoadImage("/textures/InterfaceMenu4.png");
        loseBkgrd   = ImageLoader.LoadImage("/textures/InterfaceMenu5.png");

        scoreTable1 = ImageLoader.LoadImage("/textures/scor1.png");
        scoreTable2 = ImageLoader.LoadImage("/textures/scor2.png");
        scoreTable3 = ImageLoader.LoadImage("/textures/scor3.png");

        backgroundLevel1 = ImageLoader.LoadImage("/textures/background.png");
        backgroundLevel2 = ImageLoader.LoadImage("/textures/background2.png");
        backgroundLevel3 = ImageLoader.LoadImage("/textures/background3.png");
    }
}
