package creational.abstractfactory.factories;

import creational.abstractfactory.products.Pad;
import creational.abstractfactory.products.SmartPhone;

public interface ElectronicProvider {
    SmartPhone createSmartPhone();
    Pad createPad();
}
