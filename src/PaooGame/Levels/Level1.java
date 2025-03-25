package PaooGame.Levels;

import PaooGame.Input.KeyManager;
import PaooGame.Items.Dinte;

import PaooGame.Items.Hero;
import PaooGame.RefLinks;
import PaooGame.Maps.Map;
import PaooGame.Tiles.Tile;

import java.awt.*;
import java.io.FileNotFoundException;


import static PaooGame.Graphics.Assets.backgroundLevel1;

/*! \class public class Level1 extends Level
    \brief  implementeaza Level 1
 */
public class Level1 extends Level
{
    private static Level1 instance;
    private KeyManager keyManager;
    private Dinte[] dinte = new Dinte[15];//alocare dinamica vector de dinti


    public static Level1 GetInstance(RefLinks refLink){
        if(instance == null)
            instance = new Level1(refLink);
        return instance;
    }

    public static void RemoveInstance() {
        if(instance != null)
            instance = null;
    }

    /*! \fn public Level1(RefLinks refLink)
            \brief Constructorul de initializare al clasei

            \param refLink O referinta catre un obiect "shortcut", obiect ce contine o serie de referinte utile in program.
         */
    private Level1(RefLinks refLink)
    {
        //Apel al constructorului clasei de baza
        super(refLink);

        this.keyManager = refLink.GetKeyManager();
        //Construieste harta jocului
        map = new Map(refLink, 1);
        //Referinta catre harta construita este setata si in obiectul shortcut pentru a fi accesibila si in alte clase ale programului.
        refLink.SetMap(map);

        //Construieste eroul
        Hero.RemoveInstance();
        hero = Hero.GetInstance(refLink,0, 420);
        //Construieste vectorul de dinti
        InstanceDinte();
    }

    public void InstanceDinte(){
        int[] xPositions = {3, 5, 9, 8, 13, 14, 15, 18, 21, 27, 27, 30, 31, 34, 36};
        int[] yPositions = {9, 7, 6, 10, 9, 10, 9, 4, 7, 7, 8, 9, 6, 9, 7};

        for (int i = 0; i < dinte.length; i++) {
            dinte[i] = new Dinte(refLink, 64 * xPositions[i], 64 * yPositions[i], 68, 68);
        }
    }
    @Override
    public void Update() {
        map.Update();
        hero.Update();
        for (int i = 0; i < dinte.length; i++) {
            if (dinte[i] != null) {
                dinte[i].Update();
            }
        }
    }

    /*! \fn public void Draw(Graphics g)
        \brief Deseneaza (randeaza) pe ecran starea curenta a jocului.

        \param g Contextul grafic in care trebuie sa deseneze starea jocului pe ecran.
     */
    @Override
    public void Draw(Graphics g)
    {
        g.drawImage(backgroundLevel1,0,0,40* Tile.TILE_WIDTH,16* Tile.TILE_HEIGHT,null);
        map.Draw(g);
        for(int i = 0; i< dinte.length; i++) {
            if (dinte[i] != null) {
                dinte[i].Draw(g);
            }
        }
        hero.Draw(g);
    }
}
