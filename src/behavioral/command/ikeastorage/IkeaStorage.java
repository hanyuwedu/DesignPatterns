package behavioral.command.ikeastorage;

public class IkeaStorage {
    private int tables;
    private int seats;

    public IkeaStorage(int tables, int seats) {
        this.tables = tables;
        this.seats = seats;
    }

    public boolean updateTables(int tables) {
        if (tables > this.tables) {
            System.out.println("Not enough tables left!");
            return false;
        } else {
            this.tables -= tables;
            return true;
        }
    }

    public boolean updateSeats(int seats) {
        if (seats > this.seats) {
            System.out.println("Not enough seats left!");
            return false;
        } else {
            this.seats -= seats;
            return true;
        }
    }

    public void printStorage() {
        System.out.println("There are " + this.tables + " tables left and " + this.seats + " seats left.");
    }
}
