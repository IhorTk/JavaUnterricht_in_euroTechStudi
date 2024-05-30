package Day_55_Map_Lyambda;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class LinkedHaschMapEx {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"one");
        map.put(3,"three");
        map.put(4,"four");
        map.put(2,"two");

        System.out.println("map = " + map);
    }
}
