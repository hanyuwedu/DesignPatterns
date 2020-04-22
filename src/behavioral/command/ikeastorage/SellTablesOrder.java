package behavioral.command.ikeastorage;

public class SellTablesOrder implements Order {
    int tables;
    IkeaStorage storage;
    boolean executed;

    public SellTablesOrder(int tables, IkeaStorage ikeaStorage) {
        this.tables = tables;
        this.storage = ikeaStorage;
        this.executed = false;
    }

    @Override
    public void execute() {
        if (this.storage.updateTables(tables)) {
            this.executed = true;
        }
    }

    @Override
    public void undo() {
        if (!this.executed) {
            return;
        } else {
            this.storage.updateTables(-this.tables);
            this.executed = false;
        }
    }
}
