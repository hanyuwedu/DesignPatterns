package creational.abstractfactory;

import creational.abstractfactory.factories.AppleComponentCreator;
import creational.abstractfactory.factories.HuaweiComponentCreator;
import creational.abstractfactory.factories.SamsungComponentCreator;
import creational.abstractfactory.factories.SmartPhoneComponentCreator;
import creational.abstractfactory.products.Chip;
import creational.abstractfactory.products.Screen;

public class Test {
    public static void main(String[] args) {
        SmartPhoneComponentCreator huawei = HuaweiComponentCreator.getHuaweiComponentCreator();
        Chip huaweiChip = huawei.createChip();
        Screen huaweiScreen = huawei.createScreen();
        System.out.println("Huawei is using chip of " + huaweiChip.getName() + ", screen of " + huaweiScreen.getName() + ".");

        SmartPhoneComponentCreator apple = AppleComponentCreator.getAppleComponentCreator();
        Chip appleChip = apple.createChip();
        Screen appleScreen = apple.createScreen();
        System.out.println("Apple is using chip of " + appleChip.getName() + ", screen of " + appleScreen.getName() + ".");

        SmartPhoneComponentCreator samsung = SamsungComponentCreator.getSamsungComponentCreator();
        Chip samsungChip = samsung.createChip();
        Screen samsungScreen = samsung.createScreen();
        System.out.println("Samsung is using chip of " + samsungChip.getName() + ", screen of " + samsungScreen.getName() + ".");
    }
}
