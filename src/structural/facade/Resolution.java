package structural.facade;

public enum Resolution {
    HIGH("high"),
    MEDIUM("medium"),
    LOW("low"),
    OFF("off");

    public String value;

    Resolution(String value) {
        this.value = value;
    }
}
