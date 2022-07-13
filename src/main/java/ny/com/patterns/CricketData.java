package ny.com.patterns;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class CricketData extends Observable {
    int runs;
    int wicket;
    float overs;
    ArrayList<Observer> observerList;

    public CricketData () {
        observerList = new ArrayList<> ();
    }

    public CricketData (int runs, int wicket, float overs) {
        this.runs = runs;
        this.wicket = wicket;
        this.overs = overs;
    }

    @Override
    public synchronized void addObserver (Observer o) {
        observerList.add (o);

    }

    @Override
    public synchronized void deleteObserver (Observer o) {
        observerList.remove (o);

    }


    @Override
    public void notifyObservers (Object arg) {
        for (Observer observer : observerList) {

            observer.update (this, arg);

        }

    }

    public int getLatestRuns () {
        return 100;
    }

    public int getLatestWicket () {
        return 1;
    }

    public float getLatestOvers () {
        return 5;
    }

    public void dataChanged () {
        runs = getLatestRuns ();
        wicket = getLatestWicket ();
        overs = getLatestOvers ();
        notifyObservers (new CricketData (runs, wicket, overs));
    }
}
