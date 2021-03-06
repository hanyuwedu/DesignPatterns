package structural.decorator;

public class WithChocolate extends Ingredient {
    public WithChocolate(Coffee coffee) {
        super(coffee);
        super.ingredients.add("chocolate");
    }

    @Override
    public double getPrice() {
        return super.coffee.getPrice() + 0.33;
    }
}
