package structural.decorator;

import java.util.List;

public abstract class Coffee {
    protected List<String> ingredients;

    abstract String getBase();

    abstract double getPrice();

    public List<String> getIngredients() {
        return this.ingredients;
    }

    public void print() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getBase());

        if (!this.ingredients.isEmpty()) {
            builder.append(" with ");
            for (String ingredient : this.getIngredients()) {
                builder.append(ingredient + ", ");
            }
            builder = new StringBuilder(builder.substring(0, builder.length() - 2));
        }

        builder.append(" costs ");
        builder.append(this.getPrice());
        builder.append(".");
        System.out.println(builder.toString());
    }
}
