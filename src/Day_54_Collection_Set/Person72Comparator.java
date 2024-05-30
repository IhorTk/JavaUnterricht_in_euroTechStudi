package Day_54_Collection_Set;


import java.util.Comparator;

public class Person72Comparator implements Comparator<Person72> {

    @Override
    public int compare(Person72 o1, Person72 o2) {
        return o1.age - o2.age;
    }
}
