package behavioral.templatemethod;

public class HolidaySchedule extends CalendarSchedule {
    protected HolidaySchedule(int day, int month) {
        super(day, month);
    }

    @Override
    protected void morning() {
        System.out.println("Gym work.");
        System.out.println("Breakfast.");
        System.out.println("Gaming.");
    }

    @Override
    protected void afternoon() {
        System.out.println("Lunch.");
        System.out.println("Nap.");
    }

    @Override
    protected void evening() {
        System.out.println("Dinner.");
        System.out.println("Game.");
    }

    @Override
    protected void midnight() {
        System.out.println("Snack.");
        System.out.println("Game.");
    }

    @Override
    protected boolean dateCheck() {
        return this.month == 4 || this.month == 5 || this.month == 6;
    }
}
