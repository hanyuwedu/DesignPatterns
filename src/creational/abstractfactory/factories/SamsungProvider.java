package creational.abstractfactory.factories;

import creational.abstractfactory.products.GalaxyS10;
import creational.abstractfactory.products.GalaxyTabS6;
import creational.abstractfactory.products.Pad;
import creational.abstractfactory.products.SmartPhone;

public class SamsungProvider implements ElectronicProvider {
    private static SamsungProvider samsungProvider;

    private SamsungProvider() { }

    public synchronized static SamsungProvider getSamsungProvider() {
        if (samsungProvider == null) {
            samsungProvider = new SamsungProvider();
        }
        return samsungProvider;
    }

    @Override
    public SmartPhone createSmartPhone() {
        return new GalaxyS10();
    }

    @Override
    public Pad createPad() {
        return new GalaxyTabS6();
    }
}
