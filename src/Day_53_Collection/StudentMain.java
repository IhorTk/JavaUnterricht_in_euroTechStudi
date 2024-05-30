package Day_53_Collection;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student71 oleg = new Student71("Oleg", 25);
        Student71 denis = new Student71("Denis", 32);
        Student71 ali = new Student71("Ali", 46);
        Student71 ali1 = new Student71("Ali", 46);

        ali.equals(ali1);

        List<Student71> student71s = new ArrayList<>();
        student71s.add(oleg);
        student71s.add(denis);
        student71s.add(ali);
        student71s.add(ali1);
    }
}
