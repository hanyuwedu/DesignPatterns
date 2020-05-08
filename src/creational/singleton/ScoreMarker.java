package creational.singleton;

public class ScoreMarker {
    private int gryffindor;
    private int slytherin;

    private static ScoreMarker scoreMarker;

    private ScoreMarker(int gryffindor, int slytherin) {
        this.gryffindor = gryffindor;
        this.slytherin = slytherin;
    }

    public synchronized static ScoreMarker getScoreMaker(int gryffindor, int slytherin) {   // Use synchronized to prevent abuse in multi threads
        if (scoreMarker == null) {
            scoreMarker = new ScoreMarker(gryffindor, slytherin);
        }
        return scoreMarker;
    }

    public void updateGryffindor(int score) {
        this.gryffindor += score;
        System.out.println(score + " points for Gryffindor!");
    }

    public void updateSlytherin(int score) {
        this.slytherin += score;
        System.out.println(score + " points for Slytherin!");
    }

    public void print() {
        System.out.println("Up till now, Gryffindor has " + this.gryffindor + " points" + ", Slytherin has " + this.slytherin + " points.");
    }
}
