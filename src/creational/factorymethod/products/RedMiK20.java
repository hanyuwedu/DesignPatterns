package creational.factorymethod.products;

import creational.factorymethod.Storage;

public class RedMiK20 extends SmartPhone {
    public RedMiK20(Storage storage) {
        super.name = "Xiaomi RedMi K20";
        super.storage = storage;
    }
}
