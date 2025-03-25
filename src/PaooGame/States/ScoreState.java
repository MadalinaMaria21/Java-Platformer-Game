package PaooGame.States;

import PaooGame.Database;
import PaooGame.Graphics.Assets;
import PaooGame.RefLinks;
import PaooGame.UserInterface.Button;

import java.awt.*;
import java.sql.SQLException;
//implementeaza meniul cu scorul
public class ScoreState extends State{
    private Font font = new Font("Trebuchet MS", Font.BOLD, 23);
    private Button backButton;
    public ScoreState(RefLinks refLink) {
        super(refLink);
        backButton = new Button(550,473,200,100,refLink,"Back",font);
    }

    @Override
    public void Update() {
        backButton.Update();
        if (backButton.isPressed()) {
            refLink.GetGame().SetState(refLink.GetGame().getMenuState());
        }
    }

    @Override
    public void Draw(Graphics g) throws SQLException {
        g.drawImage(Assets.scoreBkgrd,0,0,16*48, 12*48,null);
        g.setColor(Color.MAGENTA);
        g.fillOval(600,500,100,50);
        backButton.Draw(g);
        Database.GetInstance().Draw(g);
    }
}
