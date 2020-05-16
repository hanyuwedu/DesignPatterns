package creational.abstractfactory;


import creational.abstractfactory.factories.AppleProvider;
import creational.abstractfactory.factories.ElectronicProvider;
import creational.abstractfactory.factories.OppoProvider;
import creational.abstractfactory.factories.SamsungProvider;
import creational.abstractfactory.products.Pad;
import creational.abstractfactory.products.SmartPhone;

public class Test {
    public static void main(String[] args) {
        ElectronicProvider apple = AppleProvider.getAppleProvider();
        SmartPhone applePhone = apple.createSmartPhone();
        Pad applePad = apple.createPad();
        System.out.println("Apple has its smart phone as " + applePhone.getName() + ", and its pad as " + applePad.getName() + ".");

        ElectronicProvider samsung = SamsungProvider.getSamsungProvider();
        SmartPhone samsungPhone = samsung.createSmartPhone();
        Pad samsungPad = samsung.createPad();
        System.out.println("Samsung has its smart phone as " + samsungPhone.getName() + ", and its pad as " + samsungPad.getName() + ".");

        ElectronicProvider oppo = OppoProvider.getOppoProvider();
        SmartPhone oppoPhone = oppo.createSmartPhone();
        System.out.println("Oppo has its smart phone as " + oppoPhone.getName() + ".");
    }
}
