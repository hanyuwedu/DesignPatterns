package behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        CalendarSchedule date1 = new WorkSchedule(24, 4);
        date1.show();
        System.out.println();

        CalendarSchedule date2 = new WorkSchedule(1, 12);
        date2.show();
        System.out.println();

        CalendarSchedule date3 = new HolidaySchedule(14, 11);
        date3.show();
        System.out.println();

        CalendarSchedule date4 = new HolidaySchedule(25, 4);
        date4.show();
        System.out.println();
    }
}
