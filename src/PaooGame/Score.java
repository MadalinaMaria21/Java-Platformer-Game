package PaooGame;
//implementeaza scorul jocului
public class Score {
    private static Score instance;
    private int score;
    private Score(){
        score = 0;
    }
    public static Score GetInstance(){
        if(instance == null)
            instance = new Score();
        return instance;
    }
    public static void RemoveInstance(){
        instance = null;
    }

    public int GetScore(){
        return score;
    }
    public void SetScore(int score){
        this.score = score;
    }
    public void ResetScore(){
        score = 0;
    }
    public void AddScore(){
        this.score += 5;
    }

}
