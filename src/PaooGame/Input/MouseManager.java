package PaooGame.Input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
/*
    \class public class MouseManager implements MouseListener, MouseMotionListener
    \brief Gestioneaza intrarea (input-ul) de la mouse.

    Clasa verifica care si daca au fost apasate butoanele mouse lui,
    iar corespunzator click stanga este button1.

*/
public class MouseManager implements MouseListener, MouseMotionListener {
    private int xMouse, yMouse;
    private boolean left;

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            left = true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            left = false;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) { //poz cureanta
        xMouse = e.getX();
        yMouse = e.getY();
    }

    public int getMouseX() {
        return xMouse;
    }
    public int getMouseY() {
        return yMouse;
    }

    public boolean isLeftPressed() {
        return left;
    }
}
