package structural.decorator;

public class Expresso extends Base {
    public Expresso() {
        super();
    }

    @Override
    protected String getBase() {
        return "Expresso";
    }

    @Override
    public double getPrice() {
        return 4.15;
    }
}
