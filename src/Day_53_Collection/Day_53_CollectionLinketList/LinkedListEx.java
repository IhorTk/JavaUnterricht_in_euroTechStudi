package Day_53_Collection.Day_53_CollectionLinketList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Melon");
        linkedList.add("Cherry");
        linkedList.add("Ananas");
        linkedList.add("Orange");

        System.out.println("linkedList = " + linkedList);

        linkedList.addFirst("Strawbery");
        linkedList.addLast("Orange");

        System.out.println("linkedList = " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("linkedList = " + linkedList);

    }
}
