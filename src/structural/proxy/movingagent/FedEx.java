package structural.proxy.movingagent;

public class FedEx implements MovingFacility {
    @Override
    public void estimate(double kilograms) {
        double cost = this.charge(kilograms);
        System.out.println("The estimate cost would be " + cost + " euros.");
    }

    @Override
    public void ship() {
        System.out.println("The shipment would be delivered to destination on time.");
    }

    @Override
    public double charge(double kilograms) {
        return kilograms * 0.52;
    }
}
