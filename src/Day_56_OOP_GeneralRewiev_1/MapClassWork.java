package Day_56_OOP_GeneralRewiev_1;

import java.sql.Array;
import java.util.*;

public class MapClassWork {
    public static void main(String[] args) {
        String str = "ZGJGKJMJBmnk.n-kvb-kldb";
        int countzahl = 20;

        System.out.println("Mapvoz(str) = " + Mapvoz(str));
        System.out.println("===========================================");
        System.out.println("countMapvoz(str) = " + countMapvoz(str));
        System.out.println("===========================================");
        System.out.println("countZahl(countzahl) = " + countZahl(countzahl));
        System.out.println("===================================================");
        System.out.println("countInteger(countzahl) = " + countInteger(countzahl));


    }

    public static Map<Character,Integer> Mapvoz(String str){
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            Integer integer = map.get(ch);
            if (integer == null){
                map.put(ch,1);
            }else {
                map.put(ch,integer+1);
            }
        }
        return map;
    }

    static Map<Character,Integer> countMapvoz(String input){
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = input.toCharArray();

        for (Character c: chars){
            Integer orDefault = map.getOrDefault(c, 0);
            map.put(c,++orDefault);
        }
        return map;
    }

    static Map<Integer,Integer> countZahl(int countzahl){
        SortedMap<Integer,Integer> map1 = new TreeMap<>();
        Random random = new Random();
        List<Integer> zahl = new ArrayList<>();
        for (int i = 0; i <=countzahl ; i++) {
                int bb = random.nextInt(11);
            zahl.add(bb);
        }
        for (Integer bbb: zahl){
            Integer orDefault = map1.getOrDefault(bbb, 0);
            map1.put(bbb,++orDefault);
        }
        System.out.println("zahl = " + zahl);
        return map1;
    }

    static NavigableMap<Integer,Integer> countInteger(int count){
        NavigableMap<Integer,Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <=count; i++) {
            int num = (int)(Math.random()*10)+1;
            list.add(num);
            Integer orDefault = map.getOrDefault(num, 0);
            map.put(num,++orDefault);
        }
        System.out.println("list = " + list);
        return map;
    }

}
