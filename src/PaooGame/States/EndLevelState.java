package PaooGame.States;

import PaooGame.Graphics.Assets;
import PaooGame.RefLinks;
import PaooGame.UserInterface.Button;

import java.awt.*;
import java.io.FileNotFoundException;
// EndLevelState implementeaza starea de dupa terminare nivel si clasifica si identifica
// winner/looooser
public class EndLevelState extends State  {
    private Font font = new Font("Trebuchet MS", Font.BOLD, 23);
    private Button nextButton, //butoanele
                   menuButton,
                   retryButton;

    public EndLevelState(RefLinks refLink) {//implementeaza butoanele
        super(refLink);
        nextButton  = new Button(105, 430, 90, 35, refLink, "Next", font);
        menuButton  = new Button(345, 465, 90, 35, refLink, "Menu", font);
        retryButton = new Button(110, 465, 90, 35, refLink, "Retry", font);
    }

    @Override
    public void Update() throws FileNotFoundException { //functionalitati butoane
        nextButton.Update();
        menuButton.Update();
        retryButton.Update();
        if(nextButton.isPressed()){
            refLink.GetGame().SetState(refLink.GetGame().getPlayState());
        }
        if(menuButton.isPressed()){
            refLink.GetGame().SetState(refLink.GetGame().getMenuState());
        }
        if(retryButton.isPressed()) {
            refLink.GetGame().ResetGame();
            refLink.GetGame().SetState(refLink.GetGame().getPlayState());
        }
    }

    @Override
    public void Draw(Graphics g) {
        ///Win
        if(refLink.GetGame().getPlayState().win){
            g.drawImage(Assets.winBkgrd, 0, 0, 16 * 48, 12 * 48, null);
            g.setColor(Color.MAGENTA);
            g.fillOval(100,420,100,50);
            nextButton.Draw(g);
        }
        ///Lose
        else {
            g.drawImage(Assets.loseBkgrd, 0, 0, 16 * 48, 12 * 48, null);
            g.setColor(Color.MAGENTA);
            g.fillOval(100,460,100,50);
            retryButton.Draw(g);
        }

        g.setColor(Color.MAGENTA);
        g.fillOval(340,460,100,50);
        menuButton.Draw(g);
    }
}
