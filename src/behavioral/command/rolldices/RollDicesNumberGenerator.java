package behavioral.command.rolldices;

import java.util.Stack;

public class RollDicesNumberGenerator {
    private Stack<Command> commandStack;
    private int number;

    public RollDicesNumberGenerator() {
        this.commandStack = new Stack<>();
        this.number = 0;
    }

    public void rollOnce() {
        RollOneDiceCommand rollOneDiceCommand = new RollOneDiceCommand();
        this.number += rollOneDiceCommand.execute();
        commandStack.push(rollOneDiceCommand);
    }

    public void rollTwice() {
        RollTwoDicesCommand rollTwoDicesCommand = new RollTwoDicesCommand();
        this.number += rollTwoDicesCommand.execute();
        commandStack.push(rollTwoDicesCommand);
    }

    public void undo() {
        if (this.commandStack.isEmpty()) {
            System.out.println("There is no latest command!");
            return;
        }
        Command latestCommmand = commandStack.pop();
        this.number += latestCommmand.undo();
    }

    public void printCurrentNumber() {
        System.out.println("Current number is " + this.number);
    }
}
