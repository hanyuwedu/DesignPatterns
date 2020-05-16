package creational.factorymethod.factories;

import creational.factorymethod.Storage;
import creational.factorymethod.products.GalaxyS10;
import creational.factorymethod.products.SmartPhone;
import exceptions.InvalidRequestException;

public class SamsungGenerator implements SmartPhoneGenerator {
    private static SamsungGenerator samsungGenerator;

    private SamsungGenerator() {}

    public static SamsungGenerator getSamsungGenerator() {
        if (samsungGenerator == null) {
            samsungGenerator = new SamsungGenerator();
        }
        return samsungGenerator;
    }

    @Override
    public SmartPhone generateSmartPhone(Storage storage) {
        if (storage.equals(Storage.SIXTY_FOUR_GB)) {    // Galaxy S10 does not have 64GB version
            try {
                throw new InvalidRequestException("Galaxy S10 does not have 64GB version");
            } catch (InvalidRequestException e) {
                e.printStackTrace();
            }
        }

        return new GalaxyS10(storage);
    }
}
