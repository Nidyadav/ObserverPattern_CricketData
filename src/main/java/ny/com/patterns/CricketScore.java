package ny.com.patterns;




public class CricketScore {
    public static void main(String[] args){
        AverageScoreDisplay averageScore=new AverageScoreDisplay ();
        CurrentScoreDisplay currentScore=new CurrentScoreDisplay ();
        CricketData cricketData=new CricketData ();
        cricketData.addObserver (averageScore);
        cricketData.addObserver (currentScore);
        cricketData.dataChanged ();
        cricketData.deleteObserver (averageScore);
        cricketData.dataChanged ();
    }
}
