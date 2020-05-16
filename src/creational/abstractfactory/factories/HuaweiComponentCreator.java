package creational.abstractfactory.factories;

import creational.abstractfactory.products.*;

public class HuaweiComponentCreator implements SmartPhoneComponentCreator {
    private static HuaweiComponentCreator huaweiComponentCreator;

    private HuaweiComponentCreator() { }

    public synchronized static HuaweiComponentCreator getHuaweiComponentCreator() {
        if (huaweiComponentCreator == null) {
            huaweiComponentCreator = new HuaweiComponentCreator();
        }
        return huaweiComponentCreator;
    }

    @Override
    public Chip createChip() {
        return new Kirin980();
    }

    @Override
    public Screen createScreen() {
        return new OLED();
    }
}
