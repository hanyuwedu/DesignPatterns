package behavioral.templatemethod;

public class WorkSchedule extends CalendarSchedule {
    public WorkSchedule(int day, int month) {
        super(day, month);
    }

    @Override
    protected void morning() {
        if (!dateCheck()) {
            System.out.println("Gym work.");
        }
        System.out.println("Breakfast.");
        System.out.println("Work.");
    }

    @Override
    protected void afternoon() {
        System.out.println("Lunch.");
        System.out.println("Work.");
        System.out.println("Dairy");
        System.out.println("Dinner.");
    }

    @Override
    protected void evening() {
        System.out.println("Study.");
    }

    @Override
    protected void midnight() {
        return;
    }

    @Override
    protected boolean dateCheck() {
        return this.month == 10 || this.month == 11 || this.month == 12;
    }
}
