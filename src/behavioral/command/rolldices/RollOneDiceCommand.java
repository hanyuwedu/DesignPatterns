package behavioral.command.rolldices;

public class RollOneDiceCommand implements Command {
    int sum;

    public RollOneDiceCommand() {
        this.sum = 0;
    }

    @Override
    public int execute() {
        Dice dice = new Dice();
        this.sum += dice.roll();
        return this.sum;
    }

    @Override
    public int undo() {
        return -this.sum;
    }
}
