package behavioral.command.rolldices;

public class Test {
    public static void main(String[] args) {
        RollDicesNumberGenerator rollDicesNumberGenerator = new RollDicesNumberGenerator();
        rollDicesNumberGenerator.rollOnce();
        rollDicesNumberGenerator.printCurrentNumber();
        rollDicesNumberGenerator.rollTwice();
        rollDicesNumberGenerator.printCurrentNumber();
        rollDicesNumberGenerator.rollOnce();
        rollDicesNumberGenerator.printCurrentNumber();
        rollDicesNumberGenerator.undo();
        rollDicesNumberGenerator.printCurrentNumber();
    }
}
