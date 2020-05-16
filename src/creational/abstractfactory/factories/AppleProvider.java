package creational.abstractfactory.factories;

import creational.abstractfactory.products.IpadPro;
import creational.abstractfactory.products.Iphone11;
import creational.abstractfactory.products.Pad;
import creational.abstractfactory.products.SmartPhone;

public class AppleProvider implements ElectronicProvider {
    private static AppleProvider appleProvider;

    private AppleProvider() { }

    public synchronized static AppleProvider getAppleProvider() {
        if (appleProvider == null) {
            appleProvider = new AppleProvider();
        }
        return appleProvider;
    }

    @Override
    public SmartPhone createSmartPhone() {
        return new Iphone11();
    }

    @Override
    public Pad createPad() {
        return new IpadPro();
    }
}
