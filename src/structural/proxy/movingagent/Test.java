package structural.proxy.movingagent;

public class Test {
    public static void main(String[] args) {
        MovingFacility facility = new MovingAgent();
        double weight = 10.0;

        System.out.println("Estimation for moving " + weight + " kgs:");
        facility.estimate(weight);
        System.out.println();

        System.out.println("Delivery information:");
        facility.ship();
        System.out.println();

        System.out.println("Total cost would be: " + facility.charge(weight) + " Euros");
    }
}
