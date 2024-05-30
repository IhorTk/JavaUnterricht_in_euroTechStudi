package Day_33_Konstruktor_d2;

public class day_33_klasrab {
    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student("Oleg");

        Student student3 = new Student("Oleg",23);

        Student student4 = new Student(1);

        Student student5 = new Student(30, "Denis");

        Student student6 = new Student("Igor", 35,10);


    }
}
