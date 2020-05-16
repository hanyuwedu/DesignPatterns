package creational.abstractfactory.factories;

import creational.abstractfactory.products.FindX2Pro;
import creational.abstractfactory.products.Pad;
import creational.abstractfactory.products.SmartPhone;

public class OppoProvider implements ElectronicProvider {
    private static OppoProvider oppoProvider;

    private OppoProvider() { }

    public synchronized static OppoProvider getOppoProvider() {
        if (oppoProvider == null) {
            oppoProvider = new OppoProvider();
        }
        return oppoProvider;
    }


    @Override
    public SmartPhone createSmartPhone() {
        return new FindX2Pro();
    }

    @Override
    public Pad createPad() {
        /// Oppo does not have its own pad product.
        return null;
    }
}
