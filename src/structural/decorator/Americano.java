package structural.decorator;

public class Americano extends Base {
    public Americano() { }

    @Override
    protected String getBase() {
        return "Americano";
    }

    @Override
    public double getPrice() {
        return 2.15;
    }
}
