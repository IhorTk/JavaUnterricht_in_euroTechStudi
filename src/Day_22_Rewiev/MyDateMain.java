package Day_22_Rewiev;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        date1.setDay(15);
        date1.setMonth(01);
        date1.setYear(1973);

        date1.display();

        MyDate date2 = new MyDate();
        date2.day = 10;
        date2.month = 05;
        date2.year = 2021;
        date2.display();
    }
}
