package Day_32_Konstruktor;

public class Day_32_Konstruktor_KR {
    public static void main(String[] args) {

//        Student igor;
//        igor = new Student( "Igor", 100,95,95);
//
//
//
//        Student oleg = new Student();
//        oleg.name = "Oleg";
//        oleg.test1 = 100.0;
//        oleg.test2 = 100.0;
//        oleg.test3 = 95.0;
//
//        System.out.println(oleg.getName());
//        System.out.println(oleg.getAverage());
//
//        Student denis = new Student();
//        denis.name = "Denis";
//        denis.test1 = 90.0;
//        denis.test2 = 90.0;
//        denis.test3 = 90.0;
//
//        System.out.println(denis.getName());
//        System.out.println(denis.getAverage());

        Student student1 = new Student(0);
        System.out.println(student1.ID);

        Student student2 = new Student(0);
        System.out.println(student2.ID);

    }
}
