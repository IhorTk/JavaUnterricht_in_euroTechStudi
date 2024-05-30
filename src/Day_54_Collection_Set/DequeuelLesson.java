package Day_54_Collection_Set;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuelLesson {
    public static void main(String[] args) {

        Person72 denis = new Person72("Denis",30);
        Person72 igor = new Person72("Igor",18);
        Person72 evgeniy = new Person72("Evgeniy",25);
        Person72 oleg = new Person72("Oleg",33);

        Deque<Person72> deque = new ArrayDeque<>();
        deque.offer(oleg);
        deque.offer(denis);
        deque.offer(igor);
        deque.offer(evgeniy);

//        System.out.println("deque.poll() = " + deque.poll());
//        System.out.println("deque.poll() = " + deque.poll());
//        System.out.println("deque.poll() = " + deque.poll());
//        System.out.println("deque.poll() = " + deque.poll());

        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());
    }
}
