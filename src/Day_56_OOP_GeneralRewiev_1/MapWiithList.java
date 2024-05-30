package Day_56_OOP_GeneralRewiev_1;

import java.util.*;

public class MapWiithList {
    public static void main(String[] args) {

        Map<List<Integer>,String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5,6,7,8));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(9,10,11,12));

        map.put(list,"list");
        map.put(list1,"list1");
        map.put(list2,"list2");

        System.out.println("map.get(list) = " + map.get(list));
        System.out.println("map.hashCode() = " + map.hashCode());
        System.out.println("map = " + map);

    }
}
