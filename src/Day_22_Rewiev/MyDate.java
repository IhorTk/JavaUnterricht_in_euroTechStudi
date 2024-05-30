package Day_22_Rewiev;

public class MyDate {
    public  int day;
    public int month;
    public int year;

    public void setDay(int myDay){
        day = myDay;

    }
    public void setMonth(int myMonth){
        month = myMonth;

    }
    public void setYear(int myYear){
        year = myYear;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public void display(){
        System.out.println(day + " / "+month+" / "+year);
    }
}
