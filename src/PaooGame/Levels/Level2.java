package PaooGame.Levels;

import PaooGame.Input.KeyManager;
import PaooGame.Items.Dinte;

import PaooGame.Items.Hero;
import PaooGame.RefLinks;
import PaooGame.Maps.Map;
import PaooGame.Tiles.Tile;

import java.awt.*;
import java.io.FileNotFoundException;


import static PaooGame.Graphics.Assets.backgroundLevel2;
/*! \class public class Level1 extends Level
    \brief  implementeaza Level 2
 */
public class Level2 extends Level
{
    private static Level2 instance;
    private KeyManager keyManager;
    private Dinte[] dinte = new Dinte[20];//alocare dinamica vector de dinti


    public static Level2 GetInstance(RefLinks refLink){
        if(instance == null)
            instance = new Level2(refLink);
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
    private Level2(RefLinks refLink)
    {
        //Apel al constructorului clasei de baza
        super(refLink);

        this.keyManager = refLink.GetKeyManager();
        //Construieste harta jocului
        map = new Map(refLink, 2);
        //Referinta catre harta construita este setata si in obiectul shortcut pentru a fi accesibila si in alte clase ale programului.
        refLink.SetMap(map);
        //Construieste eroul
        Hero.RemoveInstance();
        hero = Hero.GetInstance(refLink,0, 420);
        //Construieste vectorul de dinti
        InstanceDinte();
    }

    public void InstanceDinte(){ //instantiaza vectorul de dinti
        int[] xPositions = {2, 2, 4, 6, 8, 9, 12, 12, 16, 17, 19, 23, 26, 29, 33, 37, 38, 43, 45, 48};
        int[] yPositions = {3, 4, 9, 7, 10, 5, 2, 8, 2, 9, 6, 3, 7, 8, 3, 6, 6, 7, 5, 7};

        for (int i = 0; i < dinte.length; i++) {
            dinte[i] = new Dinte(refLink, 64 * xPositions[i], 64 * yPositions[i], 68, 68);
        }
    }

    /*! \fn public void Update()
        \brief Actualizeaza starea curenta a jocului.
     */
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
        g.drawImage(backgroundLevel2,0,0,40* Tile.TILE_WIDTH,16* Tile.TILE_HEIGHT,null);
        map.Draw(g);
        //deseneaza vectorul de dinti
        for(int i = 0; i< dinte.length; i++) {
            if (dinte[i] != null) {
                dinte[i].Draw(g);
            }
        }
        hero.Draw(g);
    }

}
