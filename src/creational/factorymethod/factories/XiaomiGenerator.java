package creational.factorymethod.factories;

import creational.factorymethod.Storage;
import creational.factorymethod.products.RedMiK20;
import creational.factorymethod.products.SmartPhone;

public class XiaomiGenerator implements SmartPhoneGenerator {
    private static XiaomiGenerator xiaomiGenerator;

    private XiaomiGenerator() {}

    public static XiaomiGenerator getXiaomiGenerator() {
        if (xiaomiGenerator == null) {
            xiaomiGenerator = new XiaomiGenerator();
        }
        return xiaomiGenerator;
    }

    @Override
    public SmartPhone generateSmartPhone(Storage storage) {
        return new RedMiK20(storage);
    }
}
