package creational.factorymethod.factories;

import creational.factorymethod.Storage;
import creational.factorymethod.products.Iphone11;
import creational.factorymethod.products.SmartPhone;

public class AppleGenerator implements SmartPhoneGenerator {
    private static AppleGenerator appleGenerator;

    private AppleGenerator() {}

    public static AppleGenerator getAppleGenerator() {
        if (appleGenerator == null) {
            appleGenerator = new AppleGenerator();
        }
        return appleGenerator;
    }

    @Override
    public SmartPhone generateSmartPhone(Storage storage) {
        return new Iphone11(storage);
    }
}
