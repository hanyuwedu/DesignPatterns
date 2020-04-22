package behavioral.command.stockmanager;

public interface Order {
    void execute();
    void undo();
}
