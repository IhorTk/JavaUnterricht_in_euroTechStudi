package Day_53_Collection;

import java.util.*;

public class Lesson53 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        System.out.println("Do list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(10) = " + list.contains(10));

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
        System.out.println("======================================================================");
        for (Integer number: list){
            System.out.printf("%s ", number);
        }
        System.out.println();
        System.out.println("======================================================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }
        System.out.println();
        System.out.println("======================================================================");
        Integer[] integers = new Integer[list.size()];
        integers = list.toArray(integers);
        System.out.println("Arrays.toString(integers) = " + Arrays.toString(integers));

        System.out.println("======================================================================");

        list.remove(4);
        System.out.println("Posle list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("======================================================================");


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println("list.contains(list1) = " + list.containsAll(list1));
        System.out.println("======================================================================");

        list.set(0,55);
        System.out.println("list = " + list);

        list.add(0,66);
        System.out.println("list = " + list);

        List<Integer> list2 = list.subList(0, 6);
        System.out.println("list2 = " + list2);


    }

}
