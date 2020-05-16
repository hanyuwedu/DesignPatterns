package creational.abstractfactory.factories;

import creational.abstractfactory.products.*;

public class SamsungComponentCreator implements SmartPhoneComponentCreator {
    private static SamsungComponentCreator samsungComponentCreator;

    private SamsungComponentCreator() { }

    public synchronized static SamsungComponentCreator getSamsungComponentCreator() {
        if (samsungComponentCreator == null) {
            samsungComponentCreator = new SamsungComponentCreator();
        }
        return samsungComponentCreator;
    }

    @Override
    public Chip createChip() {
        return new SnapDragon855();
    }

    @Override
    public Screen createScreen() {
        return new LED();
    }
}
