package behavioral.command.rolldices;

import java.util.Random;

public class Dice {
    Random random = new Random();
    public Dice() { }

    public int roll() {
        return random.nextInt(6) + 1;
    }
}
