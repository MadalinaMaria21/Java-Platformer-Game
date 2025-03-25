package PaooGame.Maps;

import PaooGame.RefLinks;
import PaooGame.Tiles.Tile;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

/*! \class public class Map
    \brief Implementeaza notiunea de harta a jocului.
 */
public class Map {
    private RefLinks refLink;   // referinte catre un obiect "shortcut", obiect ce contine o serie de referinte utile in program
    private int width;          // Latimea hartii in numar de dale
    private int height;         // Inaltimea hartii in numar de dale
    private int[][] tiles;     // Referinta catre o matrice cu codurile dalelor ce vor construi harta
    private File mapFile;

//    public Map(RefLinks refLink, int lvl) throws FileNotFoundException{
//
//        // Retine referinta "shortcut".
//        this.refLink = refLink;
//        mapFile = new File("C:\\Users\\Madalina\\Desktop\\JocPaoo\\res\\Map_" + lvl);
//
//        //incarca harta de start. Functia poate primi ca argument id-ul hartii ce poate fi incarcat.
//        LoadWorld();
//    }
    public Map(RefLinks refLink, int lvl) {
        this.refLink = refLink;
        String filePath = "res/Map_" + lvl;
        LoadWorld(filePath);
    }
    /*! \fn public  void Update()
        \brief Actualizarea hartii in functie de evenimente (un copac a fost taiat)
     */
    public void Update() {

    }

    public void Draw(Graphics g) {
        // Calcul puncte de extrem
        int xStart = Math.max(0, (int)refLink.GetGame().GetCamera().GetX() / Tile.TILE_WIDTH);
        int xEnd = Math.min(width, (int)(refLink.GetGame().GetCamera().GetX() + refLink.GetGame().GetWidth()) / Tile.TILE_WIDTH + 1);
        int yStart = Math.max(0, (int)refLink.GetGame().GetCamera().GetY() / Tile.TILE_HEIGHT);
        int yEnd = Math.min(height, (int)(refLink.GetGame().GetCamera().GetY() + refLink.GetGame().GetHeight()) / Tile.TILE_HEIGHT + 1);

        //
        for (int y = yStart; y < yEnd; y++) {
            for (int x = xStart; x < xEnd; x++) {
                //
                Tile tile = GetTile(x, y);
                int screenX = (x * Tile.TILE_WIDTH) - (int)refLink.GetGame().GetCamera().GetX();
                int screenY = (y * Tile.TILE_HEIGHT) - (int)refLink.GetGame().GetCamera().GetY();

                //
                tile.Draw(g, screenX, screenY);
                if(tile != Tile.fara){
                    //g.setColor(Color.BLACK);
                    //g.drawRect(x * Tile.TILE_WIDTH - (int)refLink.GetGame().GetCamera().GetX(),
                           //(y * Tile.TILE_WIDTH) - (int)refLink.GetGame().GetCamera().GetY(), Tile.TILE_WIDTH, Tile.TILE_HEIGHT);
                }
            }
        }
    }

    /*! \fn public Tile GetTile(int x, int y)
        \brief Intoarce o referinta catre dala aferenta codului din matrice de dale.

        In situatia in care dala nu este gasita datorita unei erori ce tine de cod dala, coordonate gresite etc se
        intoarce o dala predefinita (ex. grassTile, mountainTile)
     */
    public Tile GetTile(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            return Tile.sol;
        }
        Tile t = Tile.tiles[tiles[x][y]];
        if (t == null) {
            return Tile.fara;
        }
        return t;
    }

    /*! \fn private void LoadWorld()
        \brief Functie de incarcare a hartii jocului.
        Aici se poate genera sau incarca din fisier harta. Momentan este incarcata static.
     */
    private void LoadWorld(String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            // Initializare latime harta
            if ((line = br.readLine()) != null)
                width = Integer.parseInt(line);

            // Initializare inaltime harta
            if ((line = br.readLine()) != null)
                height = Integer.parseInt(line);

            // Initializare matrice de coduri de dale
            tiles = new int[width][height];

            // Citeste matricea de coduri din fisier
            for (int y = 0; y < height; y++) {
                if ((line = br.readLine()) != null) {
                    String[] values = line.trim().split("\\s+");
                    for (int x = 0; x < width; x++) {
                        tiles[x][y] = Integer.parseInt(values[x]);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void LoadWorld() throws FileNotFoundException {
//        //citeste fisierul Map_1.txt
//        Scanner scanner = new Scanner(mapFile);
//
//        //citeste dimensiunile hartii din fisier
//        width = scanner.nextInt();
//        height = scanner.nextInt();
//
//        //initializeaza matricea de coduri de dale
//        tiles = new int[width][height];
//
//        //citeste matricea de coduri de dale din fisier
//        for (int y = 0; y < height; y++) {
//            for (int x = 0; x < width; x++) {
//                tiles[x][y] = scanner.nextInt();
//            }
//        }
//
//        scanner.close();
//    }


    public float GetWidth() {
        return width;
    }
    public float GetHeight()
    {
        return height;
    }
}