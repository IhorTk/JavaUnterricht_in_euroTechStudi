package Day_35_Review_Week9;
import java.util.ArrayList;

import java.time.LocalDate;

public class ClassObjectLesson {
    public static void main(String[] args) {

        Student48 oleg = new Student48("Oleg", 23, LocalDate.of(2001, 05, 21));
        Student48 anna = new Student48("Anna", 25, LocalDate.of(1999, 06, 25));
        Student48 denis = new Student48("Denis", 30, LocalDate.of(1994, 11, 26));
        Student48 ali = new Student48("Ali", 26, LocalDate.of(1997, 7, 27));
        Student48 evgeniy = new Student48("Evgeniy", 35, LocalDate.of(1992, 7, 28));
        Student48 igor = new Student48("Igor", 36, LocalDate.of(1989, 11, 29));
        Student48 bahar = new Student48("bahar", 17, LocalDate.of(2004, 1, 30));


        ClassRoom classRoom = new ClassRoom("SDET14R", "Beck");
        ArrayList<Student48> arrayList = classRoom.getArrayList();
        arrayList.add(oleg);
        arrayList.add(anna);
        arrayList.add(denis);
        arrayList.add(ali);
        arrayList.add(evgeniy);
        arrayList.add(igor);
        arrayList.add(bahar);
        System.out.println(arrayList);

        System.out.println(classRoom);


    }
}
