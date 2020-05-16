package creational.factorymethod.products;

import creational.factorymethod.Storage;

public class Iphone11 extends SmartPhone {
    public Iphone11(Storage storage) {
        super.name = "Apple iPhone 11";
        super.storage = storage;
    }
}
