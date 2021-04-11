package schoolNotes.observerPattern;

public class Main {
    public static void main(String[] args) {
        Game g = new Game();

        Player p1 = new Player();
        Player p2 = new Player();
        g.addObserver(p1);
        g.addObserver(p2);

        g.setScore(15);
    }
}
