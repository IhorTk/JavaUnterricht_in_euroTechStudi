package Day_55_Map_Lyambda;

import java.util.*;

public class HashMapExercise {
    public static void main(String[] args) {
        //Arsenal -> 11 futbolistov
        Map<String, List<String>> arsenal = new HashMap<>();
        List<String> list = new ArrayList<>(Arrays.asList("Henry","Bergcamp", "Mike","Michal", "Tom","Bop"));
        List<String> list1 = new ArrayList<>(Arrays.asList("Henry1","Bergcamp1", "Mike1","Michal1", "Tom1","Bop1"));
        arsenal.put("Arsenal", list);
        arsenal.put("ArsenalZapas", list1);

        System.out.println("arsenal = " + arsenal);
        System.out.println("================================================");

        System.out.println("arsenal.get(\"Arsenal\") = " + arsenal.get("Arsenal"));
        System.out.println("================================================");
        System.out.println("arsenal.get(\"ArsenalZapas\") = " + arsenal.get("ArsenalZapas"));


    }
}
