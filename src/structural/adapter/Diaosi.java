package structural.adapter;

public class Diaosi implements Loser {
    private String name;

    public Diaosi(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void borrowMoney(Double amount) {
        System.out.println(this.name + " has borrowed $" + amount);
    }

    @Override
    public void comfort() {
        System.out.println(this.name + " said: 'Please drink more water.'");
    }

    @Override
    public String rentCar(String car) {
        System.out.println(this.name + " has rent a " + car);
        return car;
    }

    @Override
    public void dining() {
        System.out.println(this.name + " has go out for a food stall.");
    }
}
