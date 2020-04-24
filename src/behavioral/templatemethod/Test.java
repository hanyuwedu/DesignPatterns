package behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        Calendar date1 = new WorkCalendar(24, 4);
        date1.show();
        System.out.println();

        Calendar date2 = new WorkCalendar(1, 12);
        date2.show();
        System.out.println();

        Calendar date3 = new HolidayCalendar(14, 11);
        date3.show();
        System.out.println();

        Calendar date4 = new HolidayCalendar(25, 4);
        date4.show();
        System.out.println();
    }
}
