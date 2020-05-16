package creational.factorymethod;

import creational.factorymethod.factories.AppleGenerator;
import creational.factorymethod.factories.SamsungGenerator;
import creational.factorymethod.factories.SmartPhoneGenerator;
import creational.factorymethod.factories.XiaomiGenerator;
import creational.factorymethod.products.GalaxyS10;
import creational.factorymethod.products.Iphone11;
import creational.factorymethod.products.RedMiK20;
import creational.factorymethod.products.SmartPhone;

public class Test {
    public static void main(String[] args) {
//        productTest();
        factoryTest();
    }

    private static void factoryTest() {
        SmartPhoneGenerator appleGenerator = AppleGenerator.getAppleGenerator();
        SmartPhone iphone = appleGenerator.generateSmartPhone(Storage.TWO_HUNDRED_FIFTY_SIX_GB);
        iphone.print();
        System.out.println();

        SmartPhoneGenerator xiaomiGenerator = XiaomiGenerator.getXiaomiGenerator();
        SmartPhone redmi = xiaomiGenerator.generateSmartPhone(Storage.TWO_HUNDRED_FIFTY_SIX_GB);
        redmi.print();
        System.out.println();

        SmartPhoneGenerator samsungGenerator = SamsungGenerator.getSamsungGenerator();
//        SmartPhone galaxy = samsungGenerator.generateSmartPhone(Storage.SIXTY_FOUR_GB);
        SmartPhone galaxy = samsungGenerator.generateSmartPhone(Storage.TWO_HUNDRED_FIFTY_SIX_GB);
        galaxy.print();
    }

    public static void productTest() {
        SmartPhone iphone = new Iphone11(Storage.ONE_HUNDRED_TWENTY_EIGHT_GB);
        iphone.print();

        SmartPhone galaxy = new GalaxyS10(Storage.ONE_HUNDRED_TWENTY_EIGHT_GB);
        galaxy.print();

        SmartPhone redmi = new RedMiK20(Storage.ONE_HUNDRED_TWENTY_EIGHT_GB);
        redmi.print();
    }
}
