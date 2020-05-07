package structural.adapter;

public class PrinceAdapter implements Prince {
    Loser loser;

    public PrinceAdapter(Loser loser) {
        this.loser = loser;
    }

    @Override
    public void comfort() {
        this.loser.comfort();
    }

    @Override
    public void drive() {
        this.loser.borrowMoney(300.0);
        String car = this.loser.rentCar("Prius");
        System.out.println("And drive his rented " + car);
    }

    @Override
    public void dining() {
        this.loser.borrowMoney(100.0);
        this.loser.dining();
    }
}
