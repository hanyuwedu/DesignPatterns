package creational.factorymethod.products;

import creational.factorymethod.Storage;

public abstract class SmartPhone {
    protected Storage storage;
    protected String name;


    public void print() {
        System.out.println("This is a " + this.storage.getGb() + "GB " + this.name + ".");
    }
}
