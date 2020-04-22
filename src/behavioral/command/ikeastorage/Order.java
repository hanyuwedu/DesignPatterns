package behavioral.command.ikeastorage;

public interface Order {
    void execute();
    void undo();
}
