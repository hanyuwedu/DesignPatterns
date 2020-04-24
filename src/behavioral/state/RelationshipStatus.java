package behavioral.state;

public class RelationshipStatus implements Status {
    Boy boy;
    private static RelationshipStatus relationshipStatus;

    private RelationshipStatus(Boy boy) {
        this.boy = boy;
    }

    public static RelationshipStatus getRelationshipStatus(Boy boy) {
        if (relationshipStatus == null) {
            relationshipStatus = new RelationshipStatus(boy);
        }
        return relationshipStatus;
    }

    @Override
    public void chase() {
        System.out.println("Stop doing that! You Douchebag!");
    }

    @Override
    public void propose() {
        System.out.println("Congratulations to the hall of marriage!");
        this.boy.setMarriedStatus();
    }

    @Override
    public void breakup() {
        System.out.println("Welcome back to the single's world!");
        this.boy.setSingleStatus();
    }
}