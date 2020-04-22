package behavioral.command.stockmanager;

public class Storage {
    private int unit;

    public Storage(int unit) {
        this.unit = unit;
    }

    public int getUnit() {
        return this.unit;
    }

    public void updateUnit(int update) {
        this.unit += update;
    }

    public void printStorage() {
        System.out.println("There are " + this.unit + " units left.");
    }
}
