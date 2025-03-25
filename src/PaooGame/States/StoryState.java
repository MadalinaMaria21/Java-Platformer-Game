package PaooGame.States;

import PaooGame.Graphics.Assets;
import PaooGame.RefLinks;
import PaooGame.UserInterface.Button;

import java.awt.*;
//implementeaza meniul cu story
public class StoryState extends State
{
    private Font font = new Font("Trebuchet MS", Font.BOLD, 23);
    private Button backButton;
    public StoryState(RefLinks refLink) {
        super(refLink);
        backButton = new Button(270,485,200,100,refLink,"Back",font);
    }

    @Override
    public void Update()
    {
        backButton.Update();
        if(backButton.isPressed())
        {
            refLink.GetGame().SetState(refLink.GetGame().getMenuState()) ;

            //refLink.GetGame().SetState(refLink.GetGame().getPlayState());
        }
    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.storyBkgrd,0,0,16*48, 12*48,null);
        g.setColor(Color.MAGENTA);
        g.fillOval(320,510,100,50);
        backButton.Draw(g);
    }

}
