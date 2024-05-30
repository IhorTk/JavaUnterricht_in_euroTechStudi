package Day_54_Collection_Set;

import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(3);
//        set.add(2);
//        set.add(6);
//        set.add(4);
//        System.out.println("set = " + set);
//
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()){
//            Integer num = iterator.next();
//            if (num ==4){
//                System.out.println("num = " + num);
//            }
//        }
        ArrayList<Integer> list = new ArrayList<>();
        Random ran = new Random();

        for (int i = 0; i <= 50; i++) {
            int bb = ran.nextInt(400 - 100) + 100;
            list.add(bb);
        }
        System.out.println("list = " + list);

        int sumArrayList = 0;
        for (int i = 0; i < list.size(); i++) {
            sumArrayList = sumArrayList + list.get(i);
        }
        System.out.println("sumArrayList = " + sumArrayList);

        Set<Integer> hashSet = new HashSet<>(list);
        System.out.println("hashSet = " + hashSet);

        int sumHashSet = 0;
        for (int num : hashSet) {
            sumHashSet += num;
        }
        System.out.println("sumHashSet = " + sumHashSet);
    }


}
