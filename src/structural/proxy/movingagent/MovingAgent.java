package structural.proxy.movingagent;

public class MovingAgent implements MovingFacility {
    private MovingFacility facility;

    public MovingAgent() {
        this.facility = new FedEx();
    }

    @Override
    public void estimate(double kilograms) {
        System.out.println("Estimation on agent side would take some time. Please call us directly.");
    }

    @Override
    public void ship() {
        System.out.println("The shipment is handled by FedEx");
        this.facility.ship();
    }

    @Override
    public double charge(double kilograms) {
        System.out.println("Handled by us would generate a 20% cost less than usual.");
        return facility.charge(kilograms) * 0.8;
    }
}
