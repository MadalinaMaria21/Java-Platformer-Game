package PaooGame.Items;

import PaooGame.RefLinks;

import java.awt.*;


 // Implementeaza notiunea abstracta de entitate activa din joc, "element cu care se poate interactiona: monstru, turn etc."
public abstract class Item {

     protected float x;                  // Pozitia pe axa X a "tablei" de joc a imaginii entitatii
     protected float y;                  // Pozitia pe axa Y a "tablei" de joc a imaginii entitatii
     protected int width;                // Latimea imaginii entitatii
     protected int height;               // Inaltimea imaginii entitatii
     protected Rectangle normalBounds;   // Dreptunghiul de coliziune aferent starii obisnuite(spatiul ocupat de entitate in mod normal), poate fi mai mic sau mai mare decat dimensiunea imaginii sale.*/

     protected RefLinks refLink;         // O referinte catre un obiect "shortcut", obiect ce contine o serie de referinte utile in program.*/

     // Constructor de initializare al clasei
     //param  reflink Referinte "shortcut" catre alte referinte
     //param  x   Pozitia pe axa X a "tablei" de joc a imaginii entitatii
     //param  y   Pozitia pe axa Y a "tablei" de joc a imaginii entitatii
     //param  width   Latimea imaginii entitatii
     //param  height  Inaltimea imaginii entitatii
     public Item(RefLinks refLink, float x, float y, int width, int height) {
         this.x = x;             // Retine coordonata pe axa X
         this.y = y;             // Retine coordonata pe axa Y
         this.width = width;     // Retine latimea imaginii
         this.height = height;   // Retine inaltimea imaginii
         this.refLink = refLink; // Retine the "shortcut"

         //Creaza dreptunghi de coliziune pentru modul normal, aici a fost stabilit la dimensiunea imaginii dar poate fi orice alta dimensiune
         normalBounds = new Rectangle(0, 0, width, height);
     }

     //Metoda abstracta destinata actualizarii starii curente
     public abstract void Update();

     //Metoda abstracta destinata desenarii starii curente
     public abstract void Draw(Graphics g);

     public float GetX() {
         return x;
     }

     public float GetY() {
         return y;
     }

     public int GetWidth() {
         return width;
     }

     public int GetHeight() {
         return height;
     }

     public void SetX(float x) {
         this.x = x;
     }

     public Rectangle getNormalBounds() {
         return normalBounds;
     }

     public void SetY(float y) {
         this.y = y;
     }

     public void SetWidth(int width) {
         this.width = width;
     }

     public void SetHeight(int height) {
         this.height = height;
     }

 }
