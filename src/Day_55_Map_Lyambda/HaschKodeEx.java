package Day_55_Map_Lyambda;

import java.util.HashMap;
import java.util.Map;

public class HaschKodeEx {
    public static void main(String[] args) {
        Student74 oleg = new Student74("Oleg", 75.50);
        Student74 denis = new Student74("Denis", 71.50);
        Student74 igor = new Student74("Igor", 85.00);
        Student74 evgeniy = new Student74("Evgeniy", 70.50);
        Student74 oleg1 = new Student74("Oleg", 75.50);


        Map<Student74, Integer> map3 = new HashMap<>();
        map3.put(oleg,25);
        map3.put(denis,27);
        map3.put(igor,30);
        map3.put(evgeniy,45);



        System.out.println("oleg.hashCode() = " + oleg.hashCode());
        System.out.println("oleg1.hashCode() = " + oleg1.hashCode());
        System.out.println("denis.hashCode() = " + denis.hashCode());
        System.out.println("igor.hashCode() = " + igor.hashCode());
        System.out.println("evgeniy.hashCode() = " + evgeniy.hashCode());
        System.out.println("=================================================");
        System.out.println("oleg.equals(oleg1) = " + oleg.equals(oleg1));
        System.out.println("=================================================");
        System.out.println("map3 = " + map3);


    }
}
