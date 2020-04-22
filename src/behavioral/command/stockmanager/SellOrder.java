package behavioral.command.stockmanager;

public class SellOrder implements Order {
    Storage storage;
    int units;

    public SellOrder(Storage storage, int units) {
        this.storage = storage;
        this.units = units;
    }

    @Override
    public void execute() {
        this.storage.updateUnit(-this.units);
    }

    @Override
    public void undo() {
        this.storage.updateUnit(this.units);
    }
}
