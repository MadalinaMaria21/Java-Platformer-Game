package PaooGame.States;

import PaooGame.Graphics.Assets;
import PaooGame.RefLinks;
import PaooGame.UserInterface.Button;

import java.awt.*;
//implementeaza meniul de informatii
public class InfoState extends State{
    private Font font = new Font("Trebuchet MS", Font.BOLD, 23);
    private Button backButton;
    public InfoState(RefLinks refLink) {
        super(refLink);
        backButton = new Button(400,385,200,100,refLink,"Back",font);
    }
    @Override
    public void Update()
    {
        backButton.Update();
        if (backButton.isPressed()) {
            refLink.GetGame().SetState(refLink.GetGame().getMenuState());
        }
    }
    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.infoBkgrd,0,0,16*48, 12*48,null);
        g.setColor(Color.PINK);
        g.fillOval(450,410,100,50);
        backButton.Draw(g);
    }
}
