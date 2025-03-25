package PaooGame.UserInterface;

import PaooGame.RefLinks;

import java.awt.*;
public class Button extends Rectangle {
    private RefLinks refLinks; //prin reflink se leaga de Game
    private String str;
    private Font font;
    private boolean isPressed;
    private boolean isHovered;

    public Button(int x, int y, int width, int height, RefLinks refLinks, String str, Font font) {
        super(x, y, width, height);
        this.refLinks = refLinks;
        this.str = str;
        this.font = font;
    }

    public void Update() {
        //verif daca mouse-ului este pe buton
        if(contains(refLinks.GetMouseManager().getMouseX(), refLinks.GetMouseManager().getMouseY())) {
            isHovered = true;
        }
        else {
            isHovered = false;
        }

        //verif daca mouse apasat
        if (isHovered && refLinks.GetMouseManager().isLeftPressed()) {
            isPressed = true;
        }
        else {
            isPressed = false;
        }
    }

    public void Draw(Graphics g) {
        if (isPressed) {
            g.setColor(Color.GREEN);//apasare
        } else if (isHovered) {
            g.setColor(Color.ORANGE); //deasupra
        } else {
            g.setColor(Color.CYAN); //standard
        }

        //dimensiunile textului
        FontMetrics fm = g.getFontMetrics(font);
        int stringWidth = fm.stringWidth(str);
        int stringHeight = fm.getHeight();

        //punerea in mijlocul butonului
        int textX = x + (width - stringWidth) / 2;
        int textY = y + (height - stringHeight) / 2 + fm.getAscent();

        g.setFont(font);
        g.drawString(str, textX, textY);
    }

    public boolean isPressed() {
        return isPressed;
    }
}