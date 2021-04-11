package schoolNotes.observerPattern;

import java.util.Observable;

public class Game extends Observable {
    private int score=0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        setChanged();
        notifyObservers();
    }
}
