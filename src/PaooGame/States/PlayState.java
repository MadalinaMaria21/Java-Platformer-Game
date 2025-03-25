package PaooGame.States;

import PaooGame.Database;
import PaooGame.Graphics.Assets;
import PaooGame.Items.Hero;

import PaooGame.Levels.Level;
import PaooGame.Levels.Level1;
import PaooGame.Levels.Level2;
import PaooGame.Levels.Level3;

import PaooGame.RefLinks;
import PaooGame.Score;
import PaooGame.Tiles.Tile;
import java.awt.*;

import java.sql.SQLException;
/*! \class public class PlayState extends State
    \brief Implementeaza/controleaza jocul.
 */
public class PlayState extends State
{
    private static PlayState instance;
    private Level level;
    private int countMsg;
    private Score score;
    private int scorLvl1,
                scorLvl2,
                scorLvl3;
    public boolean win;
    private int counterDelay = 0; //pentru pauza de 3 secunde



    public static PlayState GetInstance(RefLinks refLink){
        if(instance == null)
            instance = new PlayState(refLink);
        return instance;
    }

    public static void RemoveInstance() {
        if(instance != null)
            instance = null;
    }

    /*! \fn public PlayState(RefLinks refLink)
            \brief Constructorul de initializare al clasei

            \param refLink O referinta catre un obiect "shortcut", obiect ce contine o serie de referinte utile in program.
         */
    private PlayState(RefLinks refLink)   {
        //Apel al constructorului clasei de baza
        super(refLink);
        //Construire level1
        level = Level1.GetInstance(refLink);
        this.countMsg = 600;
        this.score = Score.GetInstance();
    }

    public boolean WinLevel(){ //1 daca win, 0 daca lose
        int xTile = (int)level.GetHero().GetX()/Tile.TILE_WIDTH;
        int yTile = (int)level.GetHero().GetY()/Tile.TILE_HEIGHT;
        win = false;
        if(score.GetScore() >= 50  && refLink.GetMap().GetTile(xTile, yTile) == Tile.usa){
            scorLvl1 = score.GetScore();
            win = true;
            return true;
        }
        else if(score.GetScore() >= 100 && refLink.GetMap().GetTile(xTile, yTile) == Tile.usa2) {
            scorLvl2 = score.GetScore();
            win = true;
            return true;
        }
        else if(score.GetScore() >= 150 && refLink.GetMap().GetTile(xTile, yTile) == Tile.usa3) {
            scorLvl3 = score.GetScore();
            win = true;
            return true;
        }
        else
            return false;
    }
    public boolean WinSemiLevel(){//nivel intermediar de "castig"", adica pt activare usa
        if(score.GetScore() >= 50 && level instanceof Level1) {
            countMsg = 600;
            return true;
        }
        else if(score.GetScore() >= 120  && level instanceof Level2) {
            countMsg = 600;
            return true;
        }
        else if(score.GetScore() >= 180  && level instanceof Level3) {
            countMsg = 600;
            return true;
        }
        else
            return false;
    }

    /*! \fn public void Update()
        \brief Actualizeaza starea curenta a jocului.
     */
    @Override
    public void Update() throws SQLException {
        level.Update();
        UpdateHeroLife();

        if (WinLevel() && level instanceof Level1) {
            if (counterDelay < 180) {
                // Așteaptă 180 de cadre (3 secunde)
                counterDelay++;
            }
            else {
                level = Level2.GetInstance(refLink);
                refLink.GetGame().SetState(refLink.GetGame().getEndLevelState());
                Database.GetInstance().insertData(scorLvl1, 0, 0);
                counterDelay = 0; // Resetează counterul de întârziere
            }
        }
        else if (WinLevel() && level instanceof Level2) {
            if (counterDelay < 180) {
                // Așteaptă 180 de cadre (3 secunde)
                counterDelay++;
            }
            else {
                level = Level3.GetInstance(refLink);
                refLink.GetGame().SetState(refLink.GetGame().getEndLevelState());
                Database.GetInstance().insertData(scorLvl1, scorLvl2 - scorLvl1, 0);
                counterDelay = 0; // Resetează counterul de întârziere
            }
        }
        else if (WinLevel() && level instanceof Level3) {
            if (counterDelay < 180) {
                // Așteaptă 180 de cadre (3 secunde)
                counterDelay++;
            }
            else {
                refLink.GetGame().SetState(refLink.GetGame().getScoreState());
                Database.GetInstance().insertData(scorLvl1, scorLvl2 - scorLvl1, scorLvl3 - scorLvl2);
                counterDelay = 0; // Resetează counterul de întârziere
            }
        }
    }

    public void UpdateHeroLife()  {
        if (level.GetHero().IsBad((int) level.GetHero().GetX(), (int) level.GetHero().GetY())) {
                level.GetHero().ReduceLife(1);
            if (level.GetHero().GetLife() <= 0) {
                refLink.GetGame().SetState(refLink.GetGame().getEndLevelState());
            }
            else {
               if(level instanceof Level1) {
                   score.ResetScore();
                   Level1.RemoveInstance();
                   Level1.GetInstance(refLink);
                   ((Level1) level).InstanceDinte();
                   level.GetHero().ResetHeroPosition();
               }
               else if(level instanceof Level2) {
                   score.SetScore(scorLvl1);
                   Level2.RemoveInstance();
                   Level2.GetInstance(refLink);
                   ((Level2) level).InstanceDinte();
                   level.GetHero().ResetHeroPosition();
               }
               else if(level instanceof Level3) {
                   score.SetScore(scorLvl2);
                   Level3.RemoveInstance();
                   Level3.GetInstance(refLink);
                   ((Level3) level).InstanceDinte();
                   level.GetHero().ResetHeroPosition();
               }
            }
        }
    }

    /*! \fn public void Draw(Graphics g)
        \brief Deseneaza (randeaza) pe ecran starea curenta a jocului.

        \param g Contextul grafic in care trebuie sa deseneze starea jocului pe ecran.
     */
    @Override
    public void Draw(Graphics g) throws SQLException {
        level.Draw(g);

        // Desenează scorul pe ecran
        if(level instanceof Level1)
            g.drawImage(Assets.scoreTable1,5,5,200,100,null);
        else if(level instanceof Level2)
            g.drawImage(Assets.scoreTable2,5,5,200,100,null);
        else if(level instanceof Level3)
            g.drawImage(Assets.scoreTable3,5,5,200,100,null);

        g.setColor(Color.YELLOW);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("" + score.GetScore(), 125, 47);

        if(WinSemiLevel() && countMsg >= 0) {
            g.setColor(Color.MAGENTA);
            g.drawString("Usa deblocata!!!", 210, 200);
        }
        countMsg--;
    }

    public Hero getHero() {
        return level.GetHero();
    }

    public Score GetScore(){
        return score;
    }

    public Level GetLevel() {
        return level;
    }


}
