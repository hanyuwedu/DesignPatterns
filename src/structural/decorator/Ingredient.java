package structural.decorator;

public abstract class Ingredient extends Coffee {
    Coffee coffee;

    public Ingredient(Coffee coffee) {
        this.coffee = coffee;
        super.ingredients = this.coffee.ingredients;
    }

    @Override
    String getBase() {
        return this.coffee.getBase();
    }
}
