package creational.factorymethod;

public enum Storage {
    SIXTY_FOUR_GB(64),
    ONE_HUNDRED_TWENTY_EIGHT_GB(128),
    TWO_HUNDRED_FIFTY_SIX_GB(256);

    int gb;

    Storage(int gb) {
        this.gb = gb;
    }

    public int getGb() {
        return this.gb;
    }
}
