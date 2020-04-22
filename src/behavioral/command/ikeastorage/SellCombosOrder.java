package behavioral.command.ikeastorage;

public class SellCombosOrder implements Order {
    int seats;
    int tables;
    IkeaStorage storage;
    boolean executed;

    public SellCombosOrder(int combos, IkeaStorage ikeaStorage) {
        this.seats = combos * 4;
        this.tables = combos * 1;
        this.storage = ikeaStorage;
        this.executed = false;
    }

    @Override
    public void execute() {
        if (this.storage.updateTables(tables)
                && this.storage.updateSeats(seats)) {
            this.executed = true;
        }
    }

    @Override
    public void undo() {
        if (!this.executed) {
            return;
        } else {
            this.storage.updateSeats(-this.seats);
            this.storage.updateTables(-this.tables);
            this.executed = false;
        }
    }
}
