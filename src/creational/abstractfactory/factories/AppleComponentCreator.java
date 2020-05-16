package creational.abstractfactory.factories;

import creational.abstractfactory.products.*;

public class AppleComponentCreator implements SmartPhoneComponentCreator {
    private static AppleComponentCreator appleComponentCreator;

    private AppleComponentCreator() { }

    public synchronized static AppleComponentCreator getAppleComponentCreator() {
        if (appleComponentCreator == null) {
            appleComponentCreator = new AppleComponentCreator();
        }
        return appleComponentCreator;
    }

    @Override
    public Chip createChip() {
        return new A13Bionic();
    }

    @Override
    public Screen createScreen() {
        return new LiquidRetina();
    }
}
