package structural.decorator;

public class WithMilk extends Ingredient {
    public WithMilk(Coffee coffee) {
        super(coffee);
        super.ingredients.add("milk");
    }

    @Override
    public double getPrice() {
        return super.coffee.getPrice() + 0.25;
    }
}
