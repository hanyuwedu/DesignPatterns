package structural.facade;

public class Audio {
    public Resolution resolution;

    public Audio() {
        this.resolution = Resolution.OFF;
    }

    public void setToLow() {
        this.resolution = Resolution.LOW;
        this.printStatus();
    }

    public void setToMedium() {
        this.resolution = Resolution.MEDIUM;
        this.printStatus();
    }

    public void setToHigh() {
        this.resolution = Resolution.HIGH;
        this.printStatus();
    }

    public void turnOff() {
        this.resolution = Resolution.OFF;
    }

    public void printStatus() {
        if (this.resolution.equals(Resolution.OFF)) {
            System.out.println("The audio system is currently off.");
        } else {
            System.out.println("The audio system is set to " + this.resolution.value);
        }
    }
}
