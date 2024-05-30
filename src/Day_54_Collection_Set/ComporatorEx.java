package Day_54_Collection_Set;

import java.util.*;

public class ComporatorEx  {
    public static void main(String[] args) {
        Person72 oleg= new Person72("Oleg", 25);
        Person72 denis= new Person72("Denis", 30);
        Person72 igor = new Person72("Igor", 50);
        Person72 evgeniy = new Person72("Evgeniy", 56);

        ArrayList<Person72> list = new ArrayList<>();
        list.add(evgeniy);
        list.add(oleg);
        list.add(denis);
        list.add(igor);

        System.out.println("list = " + list);
        Collections.sort(list, new Person72Comparator());
        System.out.println("list = " + list);

    }
}
