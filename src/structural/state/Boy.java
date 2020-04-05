package structural.state;

public class Boy {
    private Status status;
    private Status singleStatus, marriedStatus, relationshipStatus;

    public Boy() {
        this.singleStatus = SingleStatus.getSingleStatus(this);
        this.marriedStatus = MarriedStatus.getMarriedStatus(this);
        this.relationshipStatus = RelationshipStatus.getRelationshipStatus(this);

        this.status = this.singleStatus;
    }

    public void setSingleStatus() {
        this.singleStatus = this.singleStatus;
    }

    public void setMarriedStatus() {
        this.marriedStatus = this.marriedStatus;
    }

    public void setRelationshipStatus() {
        this.relationshipStatus = this.relationshipStatus;
    }

    public void chase() {
        this.status.chase();
    }

    public void propose() {
        this.status.propose();
    }

    public void breakup() {
        this.status.breakup();
    }
}
