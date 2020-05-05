package structural.decorator;

public class Americano extends Base {
    public Americano() { }

    @Override
    String getBase() {
        return "Americano";
    }

    @Override
    double getPrice() {
        return 2.15;
    }
}
