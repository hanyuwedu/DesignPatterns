package behavioral.templatemethod;

public class WorkCalendar extends Calendar {
    public WorkCalendar(int day, int month) {
        super(day, month);
    }

    @Override
    public void morning() {
        if (!dateCheck()) {
            System.out.println("Gym work.");
        }
        System.out.println("Breakfast.");
        System.out.println("Work.");
    }

    @Override
    public void afternoon() {
        System.out.println("Lunch.");
        System.out.println("Work.");
        System.out.println("Dairy");
        System.out.println("Dinner.");
    }

    @Override
    public void evening() {
        System.out.println("Study.");
    }

    @Override
    public void midnight() {
        return;
    }

    @Override
    public boolean dateCheck() {
        return this.month == 10 || this.month == 11 || this.month == 12;
    }
}
