package Day_55_Map_Lyambda;

import java.util.*;

public class HashMapGeneral {
    public static void main(String[] args) {
        Map<String, Double> map1 = new HashMap<>();
        // metod put
        map1.put("Oleg", 82.00);
        map1.put("Igor", 85.00);
        map1.put("Denis", 75.00);
        map1.put("Ali", 82.50);
        map1.put(null, 95.00);
        map1.put("Evgeniy", null);
        map1.put("Oleg", 110.00);

        System.out.println("map1.isEmpty() = " + map1.isEmpty());
        System.out.println("================================================");

        Map<Integer,Integer> map = new HashMap<>();
        System.out.println("map.isEmpty() = " + map.isEmpty());
        System.out.println("================================================");

        for (Map.Entry<String,Double> entry : map1.entrySet()){
            System.out.println("key:  " + entry.getKey()+ " , " + "value:  " + entry.getValue());
        }
        System.out.println("==================================================");

        Set<String> stringSet = map1.keySet();
        for (String s: stringSet){
            System.out.println("key-" + s+" , value -  " + map1.get(s));
        }
        System.out.println("=====================================================");


        Set<Integer> set = new HashSet<>();
//      Map<Integer,constant> map = HashMap<>();

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()){
          Integer next = iterator.next();
            System.out.println("next = " + next);
        }
    }
}
