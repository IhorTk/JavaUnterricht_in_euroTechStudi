package Day_55_Map_Lyambda;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class ThreeMapEx {
    public static void main(String[] args) {
        SortedMap<Integer,String> map = new TreeMap<>();
        map.put(1,"one");
        map.put(3,"three");
        map.put(4,"four");
        map.put(2,"two");

        System.out.println("map = " + map);

        Student74 oleg = new Student74("Oleg", 75.50);
        Student74 denis = new Student74("Denis", 71.50);
        Student74 igor = new Student74("Igor", 85.00);
        Student74 evgeniy = new Student74("Evgeniy", 70.50);
        Student74 ali = new Student74("Ali", 72.50);

        SortedMap<Student74,Integer> map1 = new TreeMap<>(new Comparator<Student74>() {
            @Override
            public int compare(Student74 o1, Student74 o2) {
                return (int) (o1.grade- o2.grade);
            }

        });

      map1.put(oleg,1);
      map1.put(denis,2);
      map1.put(igor,3);
      map1.put(evgeniy,4);
      map1.put(ali,5);

        System.out.println("map1 = " + map1);

        System.out.println("map1.tailMap(denis) = " + map1.tailMap(denis));

        System.out.println("map1.headMap(denis) = " + map1.headMap(denis));

        System.out.println("map1.firstKey() = " + map1.firstKey());
        System.out.println("map1.lastKey() = " + map1.lastKey());
    }

}
