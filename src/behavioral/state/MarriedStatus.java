package behavioral.state;

public class MarriedStatus implements Status {
    private Boy boy;
    private static MarriedStatus marriedStatus;

    private MarriedStatus(Boy boy) {
        this.boy = boy;
    }

    public static MarriedStatus getMarriedStatus(Boy boy) {
        if (marriedStatus == null) {
            marriedStatus = new MarriedStatus(boy);
        }
        return marriedStatus;
    }

    @Override
    public void chase() {
        System.out.println("Stop thinking of that! you scrum bag!");
    }

    @Override
    public void propose() {
        System.out.println("What are you thinking you asshole!");
    }

    @Override
    public void breakup() {
        System.out.println("Sorry but congratulations to your freedom.");
        this.boy.setSingleStatus();
    }
}
