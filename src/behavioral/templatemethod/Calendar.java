package behavioral.templatemethod;

public abstract class Calendar {
    protected int day;
    protected int month;

    protected Calendar(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public final void show() {
        calendarTitle();
        getup();
        morning();
        afternoon();
        evening();
        if (dateCheck()) {
            midnight();
        }
        sleep();
    }

    protected final void calendarTitle() {
        System.out.println("The plan for " + this.day + "." + this.month + " is following:");
    }

    protected final void getup() {
        System.out.println("Get up.");
    }

    protected final void sleep() {
        System.out.println("Go to sleep.");
    }

    protected abstract void morning();
    protected abstract void afternoon();
    protected abstract void evening();
    protected abstract void midnight();

    protected abstract boolean dateCheck();
}
