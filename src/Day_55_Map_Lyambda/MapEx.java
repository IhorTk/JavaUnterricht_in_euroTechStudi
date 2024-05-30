package Day_55_Map_Lyambda;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
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


        System.out.println("map1 = " + map1);
        System.out.println("==========================================");

        //metod get
        System.out.println("map1.get(\"Oleg\") = " + map1.get("Oleg"));
        System.out.println("map1.get(null) = " + map1.get(null));
        System.out.println("============================================");
        // metod size
        System.out.println("map1.size() = " + map1.size());

        System.out.println("============================================");
        //method containsKey
        System.out.println("map1.containsKey(\"Oleg\") = " + map1.containsKey("Oleg"));
        System.out.println("map1.containsKey(\"Igor\") = " + map1.containsKey("Igor"));

        System.out.println("============================================");
        //method containsValue

        System.out.println("map1.containsValue(85.00) = " + map1.containsValue(85.00));
        System.out.println("map1.containsValue(100.00) = " + map1.containsValue(100.00));

        System.out.println("============================================");

        System.out.println("map1.remove(\"Ali\") = " + map1.remove("Ali"));
        System.out.println("map1 = " + map1);

        System.out.println("============================================");

        Map<String,Double> map2 = new HashMap<>();
        map2.put("Anna", 100.00);
        map2.put("Bahar", 50.00);
        map1.putAll(map2);
        System.out.println("map1 = " + map1);

        System.out.println("============================================");
        // method keySet

        Set<String> stringSet = map1.keySet();
        System.out.println("stringSet = " + stringSet);
        System.out.println("============================================");

        Collection<Double> values = map1.values();
        System.out.println("values = " + values);

        System.out.println("============================================");

    }

}
