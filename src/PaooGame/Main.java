package PaooGame;

public class Main
{
    public static void main(String[] args)
    {
        Game paooGame = Game.getInstance("Madalina", 16*48, 12*48);
        paooGame.StartGame();
    }
}
