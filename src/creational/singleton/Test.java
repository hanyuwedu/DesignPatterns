package creational.singleton;

public class Test {
    public static void main(String[] args) {
        ScoreMarker dumbledore = ScoreMarker.getScoreMaker(100, 100);
        dumbledore.updateGryffindor(10);
        dumbledore.print();
        System.out.println();

        ScoreMarker snape = ScoreMarker.getScoreMaker(0, 0);    // for the second time values in constructor do not work
        snape.updateGryffindor(-10);
        snape.updateSlytherin(30);
        snape.print();
        System.out.println();

        ScoreMarker mcGonagall = ScoreMarker.getScoreMaker(0, 0);
        mcGonagall.updateGryffindor(10);
        mcGonagall.updateSlytherin(10);
        mcGonagall.print();
    }
}
