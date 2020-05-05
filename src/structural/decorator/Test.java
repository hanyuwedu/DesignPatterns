package structural.decorator;

public class Test {
    public static void main(String[] args) {
        Coffee coffee = new Expresso();
        coffee.print();

        coffee = new WithChocolate(coffee);
        coffee = new WithMilk(coffee);
        coffee = new WithMilk(coffee);
        coffee.print();
    }
}
