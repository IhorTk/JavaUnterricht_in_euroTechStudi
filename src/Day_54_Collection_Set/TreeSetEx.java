package Day_54_Collection_Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(10);
        treeSet.add(25);
        treeSet.add(11);
        treeSet.add(4);
        treeSet.add(1);
        System.out.println("treeSet = " + treeSet);

//        Person72 denis = new Person72("Denis",30);
//        Person72 igor = new Person72("Igor",18);
//        Person72 evgeniy = new Person72("Evgeniy",25);
//        Person72 oleg = new Person72("Oleg",33);
//
//        TreeSet<Person72> treeSet1 = new TreeSet<>(new Person72Comparator());
//        treeSet1.add(oleg);
//        treeSet1.add(igor);
//        treeSet1.add(evgeniy);
//        treeSet1.add(denis);
//
//        System.out.println("treeSet1 = " + treeSet1);

        SortedSet<Person72> treeSet2 = new TreeSet<>(new Person72Comparator());
        Person72 denis = new Person72("Denis",30);
        Person72 igor = new Person72("Igor",18);
        Person72 evgeniy = new Person72("Evgeniy",25);
        Person72 oleg = new Person72("Oleg",33);
        treeSet2.add(oleg);
        treeSet2.add(igor);
        treeSet2.add(evgeniy);
        treeSet2.add(denis);
        System.out.println("treeSet2 = " + treeSet2);


    }
}
