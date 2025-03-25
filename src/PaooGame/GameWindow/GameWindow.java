package PaooGame.GameWindow;

import javax.swing.*;
import java.awt.*;

  //GameWindow Implementeaza notiunea de fereastra a jocului.
    //Membrul wndFrame este un obiect de tip JFrame care va avea utilitatea unei
    //ferestre grafice si totodata si cea a unui container (toate elementele
    //grafice vor fi continute de fereastra).
public class GameWindow
{
    private JFrame  wndFrame;       // fereastra principala a jocului
    private String  wndTitle;       // titlul ferestrei
    private int     wndWidth;       // latimea ferestrei in pixeli
    private int     wndHeight;      // inaltimea ferestrei in pixeli
    private Canvas  canvas;         // "panza/tablou" in care se poate desena*/

    /*! \fn GameWindow(String title, int width, int height)
            \brief Constructorul cu parametri al clasei GameWindow

            Retine proprietatile ferestrei proprietatile (titlu, latime, inaltime)
            in variabilele membre deoarece vor fi necesare pe parcursul jocului.
            Crearea obiectului va trebui urmata de crearea ferestrei propriuzise
            prin apelul metodei BuildGameWindow()

            \param title Titlul ferestrei.
            \param width Latimea ferestrei in pixeli.
            \param height Inaltimea ferestrei in pixeli.
         */
    public GameWindow(String title, int width, int height){
        wndTitle    = title;    // Retine titlul ferestrei
        wndWidth    = width;    // Retine latimea ferestrei
        wndHeight   = height;   // Retine inaltimea ferestrei
        wndFrame    = null;     // Fereastra nu este construita
    }
    /*! \fn private void BuildGameWindow()
        \ Construieste/creaza fereastra si seteaza toate proprietatile
        necesare: dimensiuni, pozitionare in centrul ecranului, operatia de
        inchidere, invalideaza redimensionarea ferestrei, afiseaza fereastra.

     */
    public void BuildGameWindow()
    {
        // Daca fereastra a mai fost construita intr-un apel anterior se renunta la apel
        if(wndFrame != null)
        {
            return;
        }
        // Aloca memorie pentru obiectul de tip fereastra si seteaza denumirea ce apare in bara de titlu
        wndFrame = new JFrame("Catch TEETH---Game");
        // Seteaza dimensiunile ferestrei in pixeli
        wndFrame.setSize(wndWidth, wndHeight);
        wndFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // inchidere intreg programul
        // Avand in vedere ca dimensiunea ferestrei poate fi modificata
        // si corespunzator continutul actualizat (aici ma refer la dalele
        // randate) va recomand sa constrangeti deocamdata jucatorul
        // sa se joace in fereastra stabilitata de voi
        wndFrame.setResizable(false);
        wndFrame.setLocationRelativeTo(null);
        // Implicit o fereastra cand este creata nu este vizibila motiv pentru
        //care trebuie setata aceasta proprietate
        wndFrame.setVisible(true);

        // Creaza obiectul de tip canvas (panza) pe care se poate desena.
        canvas = new Canvas();
        // In aceeasi maniera trebuiesc setate proprietatile pentru acest obiect
        // canvas (panza): dimensiuni preferabile, minime, maxime etc.
        // Urmotorul apel de functie seteaza dimensiunea "preferata"/implicita
        // a obiectului de tip canvas.
        // Functia primeste ca parametru un obiect de tip Dimension ca incapsuleaza
        // doua proprietati: latime si inaltime. Cum acest obiect nu exista
        // a fost creat unul si dat ca parametru.
        canvas.setPreferredSize(new Dimension(wndWidth, wndHeight));
        // Avand in vedere ca elementele unei ferestre pot fi scalate atunci cand
        // fereastra este redimensionata
        canvas.setMaximumSize(new Dimension(wndWidth, wndHeight));
        canvas.setMinimumSize(new Dimension(wndWidth, wndHeight));
        // Avand in vedere ca obiectul de tip canvas, proaspat creat, nu este automat
        // adaugat in fereastra trebuie apelata metoda add a obiectul wndFrame
        wndFrame.add(canvas);
        // Urmatorul apel de functie are ca scop eventuala redimensionare a ferestrei
        // ca tot ce contine sa poate fi afisat complet
        wndFrame.pack();
    }

    //  Returneaza latimea ferestrei.

    public int GetWndWidth()
    {
        return wndWidth;
    }

    //  Returneaza inaltimea ferestrei.
    public int GetWndHeight()
    {
        return wndHeight;
    }

    // Returneaza referinta catre canvas-ul din fereastra pe care se poate desena.

    public Canvas GetCanvas()
    {
        return canvas;
    }

   // Returneaza referinta catre canvas-ul din fereastra pe care se poate desena.

    public JFrame GetWndFrame()
    {
        return wndFrame;
    }
}