package behavioral.command.ikeastorage;

public class SellSeatsOrder implements Order {
    int seats;
    IkeaStorage storage;
    boolean executed;

    public SellSeatsOrder(int seats, IkeaStorage ikeaStorage) {
        this.seats = seats;
        this.storage = ikeaStorage;
        this.executed = false;
    }

    @Override
    public void execute() {
        if (this.storage.updateSeats(seats)) {
            this.executed = true;
        }
    }

    @Override
    public void undo() {
        if (!this.executed) {
            return;
        } else {
            this.storage.updateSeats(-this.seats);
            this.executed = false;
        }
    }
}
