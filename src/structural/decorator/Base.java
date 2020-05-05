package structural.decorator;

import java.util.ArrayList;

public abstract class Base extends Coffee {
    public Base() {
        super.ingredients = new ArrayList<>();
    }
}
