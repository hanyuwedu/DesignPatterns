package behavioral.command.ikeastorage;

public class AddSupplyOrder implements Order {
    int seats;
    int tables;
    IkeaStorage storage;

    public AddSupplyOrder(int seats, int tables, IkeaStorage storage) {
        this.seats = seats;
        this.tables = tables;
        this.storage = storage;
    }

    @Override
    public void execute() {
        this.storage.updateSeats(-this.seats);
        this.storage.updateTables(-this.tables);
    }

    @Override
    public void undo() {
        this.storage.updateSeats(this.seats);
        this.storage.updateTables(this.tables);
    }
}
