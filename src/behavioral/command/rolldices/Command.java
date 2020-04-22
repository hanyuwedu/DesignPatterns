package behavioral.command.rolldices;

public interface Command {
    int execute();
    int undo();
}
