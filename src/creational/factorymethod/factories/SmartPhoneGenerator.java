package creational.factorymethod.factories;

import creational.factorymethod.Storage;
import creational.factorymethod.products.SmartPhone;

public interface SmartPhoneGenerator {
    SmartPhone generateSmartPhone(Storage storage);
}
