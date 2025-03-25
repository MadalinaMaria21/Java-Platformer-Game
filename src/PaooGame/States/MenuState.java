package PaooGame.States;

import PaooGame.Graphics.Assets;
import PaooGame.RefLinks;
import PaooGame.UserInterface.Button;

import java.awt.*;
import java.io.FileNotFoundException;

/*! \class public class MenuState extends State
    \brief Implementeaza notiunea de menu pentru joc.
 */
public class MenuState extends State
{
    private Font font = new Font("Trebuchet MS", Font.BOLD, 23);

    private Button playButton,
                    scoreButton,
                    infoButton,
                    storyButton;
    /*! \fn public MenuState(RefLinks refLink)
        \brief Constructorul de initializare al clasei.

        \param refLink O referinta catre un obiect "shortcut", obiect ce contine o serie de referinte utile in program.
     */
    public MenuState(RefLinks refLink)
    {
            ///Apel al constructorului clasei de baza.
        super(refLink);
        playButton = new Button(395, 175, 90, 35, refLink, "Play", font);
        scoreButton = new Button(395, 265, 90, 35, refLink, "Score", font);
        infoButton = new Button(395, 338, 90, 35, refLink, "Info", font);
        storyButton = new Button(395,418,90, 35, refLink, "Story", font);
    }
    /*! \fn public void Update()
        \brief Actualizeaza starea curenta a meniului.
     */
    @Override
    public void Update() throws FileNotFoundException {
        playButton.Update();
        scoreButton.Update();
        infoButton.Update();
        storyButton.Update();

        if(playButton.isPressed())
        {
            if(refLink.GetGame().getPlayState() != null &&
                    (refLink.GetGame().getPreviousState() instanceof EndLevelState ||
                            refLink.GetGame().getPreviousState() instanceof ScoreState))
                refLink.GetGame().ResetGame();              //daca deja exista un meci jucat, trebuie sters mai intai
            refLink.GetGame().SetState(PlayState.GetInstance(refLink));
        }
        else if(infoButton.isPressed())
        {
            refLink.GetGame().SetState(refLink.GetGame().getInfoState());
        }
        else if(storyButton.isPressed())
        {
            refLink.GetGame().SetState((refLink.GetGame().getStoryState()));
        }
        if(scoreButton.isPressed())
        {
            refLink.GetGame().SetState(refLink.GetGame().getScoreState());
        }
    }

    /*! \fn public void Draw(Graphics g)
        \brief Deseneaza (randeaza) pe ecran starea curenta a meniului.

        \param g Contextul grafic in care trebuie sa deseneze starea jocului pe ecran.
     */
    @Override
    public void Draw(Graphics g)
    {
        g.drawImage(Assets.menuBkgrd,0,0,16*48, 12*48,null);
        playButton.Draw(g);
        scoreButton.Draw(g);
        infoButton.Draw(g);
        storyButton.Draw(g);
    }
}
