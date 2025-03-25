package PaooGame.Levels;

import PaooGame.Input.KeyManager;
import PaooGame.Items.Dinte;

import PaooGame.Items.Flex;
import PaooGame.Items.Hero;
import PaooGame.Items.Monster;
import PaooGame.RefLinks;
import PaooGame.Maps.Map;
import PaooGame.Tiles.Tile;

import java.awt.*;
import java.io.FileNotFoundException;

import static PaooGame.Graphics.Assets.*;
/*! \class public class Level1 extends Level
    \brief  implementeaza Level 3
 */
public class Level3 extends Level
{
    private static Level3 instance;
    private KeyManager keyManager;
    private Dinte[] dinte = new Dinte[25];//alocare dinamica vector de dinti
    private Flex [] flex  = new Flex[6];
    private Monster monster;

    public static Level3 GetInstance(RefLinks refLink){
        if(instance == null)
            instance = new Level3(refLink);
        return instance;
    }

    public static void RemoveInstance() {
        if(instance != null)
            instance = null;
    }

    private Level3(RefLinks refLink)
    {
        //Apel al constructorului clasei de baza
        super(refLink);

        this.keyManager = refLink.GetKeyManager();
        //Construieste harta jocului
        map = new Map(refLink, 3);
        //Referinta catre harta construita este setata si in obiectul shortcut pentru a fi accesibila si in alte clase ale programului.
        refLink.SetMap(map);
        //Construieste eroul
        Hero.RemoveInstance();
        hero = Hero.GetInstance(refLink,0, 420);

        //Construieste vectorul de dinti
        this.monster = new Monster(refLink, 31* Tile.TILE_WIDTH, 9*Tile.TILE_HEIGHT);

        InstanceDinte();
        InstanceFlex();

    }

    private void InstanceFlex() { //instantiaza vectorul cu flex- uri
        int[] xPositions = {4, 5, 5, 13, 31, 24};
        int[] yPositions = {4, 4, 5, 5 , 6, 2};

        for (int i = 0; i < flex.length; i++){
            flex[i] = new Flex(refLink, 64 * xPositions[i], 64 * yPositions[i] - 10, Tile.TILE_WIDTH, Tile.TILE_HEIGHT);
        }
    }

    public void InstanceDinte(){
        int[] xPositions = {4, 5, 4, 9, 12, 10, 13, 15, 22, 23, 24, 28, 31, 32, 33, 33, 38, 38, 44, 46, 47, 51, 54, 56, 56};
        int[] yPositions = {8, 7, 1, 2, 2, 8, 7, 3, 6, 5, 3, 6, 9, 8, 9, 3, 1, 6, 5, 3, 6, 5, 5, 8, 3};

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
        monster.Update();
        for (int i = 0; i < dinte.length; i++) {
            if (dinte[i] != null) {
                dinte[i].Update();
            }
        }
        for (int i = 0; i < flex.length; i++) {
            if (flex[i] != null) {
                flex[i].Update();
            }
        }
        MonsterCollision();
        FlexCollision();
    }

    public void FlexCollision(){ //coliziunea cu flexul- obiect mortal
        for (int i = 0; i < flex.length; i++) {
            if (hero.getNormalBounds().intersects(flex[i].getNormalBounds()))
                refLink.GetGame().SetState(refLink.GetGame().getEndLevelState());
        }
    }

    public void MonsterCollision(){ //coliziunea dintre KAira cu Sik:)))
        if (hero.getNormalBounds().intersects(monster.getNormalBounds()))
            refLink.GetGame().SetState(refLink.GetGame().getEndLevelState());
    }
    /*! \fn public void Draw(Graphics g)
        \brief Deseneaza (randeaza) pe ecran starea curenta a jocului.

        \param g Contextul grafic in care trebuie sa deseneze starea jocului pe ecran.
     */
    @Override
    public void Draw(Graphics g)
    {
        g.drawImage(backgroundLevel3,0,0,40* Tile.TILE_WIDTH,16* Tile.TILE_HEIGHT,null);
        map.Draw(g);
        //desenare dinti mov
        for(int i = 0; i< dinte.length; i++) {
            if (dinte[i] != null) {
                dinte[i].Draw(g);
            }
        }
        //desenare flex uri
        for(int i = 0; i< flex.length; i++) {
            if (flex[i] != null) {
                flex[i].Draw(g);
            }
        }
        monster.Draw(g);
        hero.Draw(g);
    }
}
