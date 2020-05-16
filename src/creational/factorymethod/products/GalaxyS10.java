package creational.factorymethod.products;

import creational.factorymethod.Storage;

public class GalaxyS10 extends SmartPhone {
    public GalaxyS10(Storage storage) {
        super.name = "Samsung Galaxy S10";
        super.storage = storage;
    }
}
