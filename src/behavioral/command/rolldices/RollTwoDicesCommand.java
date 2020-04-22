package behavioral.command.rolldices;

public class RollTwoDicesCommand implements Command {
    int sum;

    public RollTwoDicesCommand() {
        this.sum = 0;
    }

    @Override
    public int execute() {
        Dice dice = new Dice();
        this.sum += dice.roll();
        this.sum += dice.roll();
        return this.sum;
    }

    @Override
    public int undo() {
        return -this.sum;
    }
}
