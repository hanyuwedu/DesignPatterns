package behavioral.state;

public class SingleStatus implements Status {
    private Boy boy;
    private static SingleStatus singleStatus;

    private SingleStatus(Boy boy) {
        this.boy = boy;
    }

    public static SingleStatus getSingleStatus(Boy boy) {
        if (singleStatus == null) {
            singleStatus = new SingleStatus(boy);
        }
        return singleStatus;
    }

    @Override
    public void chase() {
        System.out.println("Congratulations! You have a girlfriend now!");
        this.boy.setRelationshipStatus();
    }

    @Override
    public void propose() {
        System.out.println("What are you thinking? Go jerk off now!");
    }

    @Override
    public void breakup() {
        System.out.println("What are you even dreaming?! You poor single dog!");
    }
}