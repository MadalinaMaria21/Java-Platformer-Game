package PaooGame.Levels;

import PaooGame.Input.KeyManager;
import PaooGame.Items.Hero;
import PaooGame.Maps.Map;
import PaooGame.RefLinks;

import java.awt.*;
//Clasa abdstracta care implementeaza notiiunea de nivel a jocului,
// este utilizata in clasele derivate Level1, Level2, Level3
public abstract class Level {
    protected RefLinks refLink;
    protected Map map;    // Referinta catre harta curenta
    protected KeyManager keyManager;
    protected Hero hero;

    public Level(RefLinks refLink) { //constructor
        this.refLink = refLink;
        this.keyManager = refLink.GetKeyManager();
        this.hero = Hero.GetInstance(refLink, 0, 420);
    }
    //metode abstracte care vor fi implementate in copii
    public abstract void Update();
    public abstract void Draw(Graphics g);

    public Hero GetHero(){
        return hero;
    }

    public Map GetMap() { return map;}
    public void SetMap(Map map) { refLink.SetMap(map); }
}
