package structural.decorator;

public class Expresso extends Base {
    public Expresso() {
        super();
    }

    @Override
    String getBase() {
        return "Expresso";
    }

    @Override
    double getPrice() {
        return 4.15;
    }
}
