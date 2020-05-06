package structural.decorator;

public abstract class Ingredient extends Coffee {
    protected Coffee coffee;

    public Ingredient(Coffee coffee) {
        this.coffee = coffee;
        super.ingredients = this.coffee.ingredients;
    }

    @Override
    protected String getBase() {
        return this.coffee.getBase();
    }
}
