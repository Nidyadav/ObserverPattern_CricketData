package ny.com.patterns;


import java.util.Observable;
import java.util.Observer;

public class AverageScoreDisplay implements Observer {
    private float runRate;
    private int predictedScore;


    public void display()
    {
      System.out.println ("Average Score Display:::\n"+"Run rate: "+runRate+"\nPredicted score: "+predictedScore);
    }


    @Override
    public void update (Observable o, Object arg) {
        CricketData cricketData= (CricketData) arg;
        this.runRate= cricketData.runs/cricketData.overs;
        this.predictedScore= (int) (this.runRate*50);
        display ();
    }
}
