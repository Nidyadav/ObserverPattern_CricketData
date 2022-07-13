package ny.com.patterns;


import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CurrentScoreDisplay implements Observer {
    int runs;
    int wickets;
    float overs;



    private void display () {
        Logger logger=Logger.getLogger("display current score");

        logger.logp (Level.INFO,"ny.com.patterns","display","Current Score Display:::\n"+"runs: "+runs+
                "\nwickets: "+wickets +"\n overs: "+overs);

    }


    @Override
    public void update (Observable o, Object arg) {
        CricketData cricketData= (CricketData) arg;
        this.runs=cricketData.runs;
        this.wickets=cricketData.wicket;
        this.overs=cricketData.overs;
        display();
    }
}
