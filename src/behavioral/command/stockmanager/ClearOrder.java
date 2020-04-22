package behavioral.command.stockmanager;

public class ClearOrder implements Order {
    Storage storage;
    int units;

    public ClearOrder(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void execute() {
        this.units = this.storage.getUnit();
        this.storage.updateUnit(-this.units);
    }

    @Override
    public void undo() {
        this.storage.updateUnit(this.units);
    }
}
