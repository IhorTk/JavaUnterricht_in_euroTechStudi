package Day_54_Collection_Set;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueieLesson {
    public static void main(String[] args) {
//        Queue<String> queue = new PriorityQueue<>();
//        queue.offer("Oleg");
//        queue.offer("Denis");
//        queue.offer("Evgeniy");
//        queue.offer("Igor");
//        System.out.println("queue = " + queue);
//        System.out.println("queue.peek() = " + queue.peek());
//        System.out.println("====================================================");
//
//        Queue<Integer> integerQueue = new PriorityQueue<>();
//        integerQueue.offer(1);
//        integerQueue.offer(3);
//        integerQueue.offer(10);
//        integerQueue.offer(2);
//        integerQueue.offer(21);
//        integerQueue.offer(12);
//        integerQueue.offer(5);
//        integerQueue.offer(16);
//
//
//        System.out.println("integerQueue = " + integerQueue);
//        System.out.println("integerQueue.peek() = " + integerQueue.peek());
//        System.out.println("integerQueue.poll() = " + integerQueue.poll());
//        System.out.println("integerQueue.poll() = " + integerQueue.poll());
//        System.out.println("integerQueue.poll() = " + integerQueue.poll());
//        System.out.println("integerQueue.poll() = " + integerQueue.poll());
//        System.out.println("integerQueue.poll() = " + integerQueue.poll());
//        System.out.println("integerQueue.poll() = " + integerQueue.poll());



        Person72 denis = new Person72("Denis",30);
        Person72 igor = new Person72("Igor",18);
        Person72 evgeniy = new Person72("Evgeniy",25);
        Person72 oleg = new Person72("Oleg",33);

        Queue<Person72> person72Queue = new PriorityQueue<>(new Person72Comparator());
        person72Queue.offer(oleg);
        person72Queue.offer(denis);
        person72Queue.offer(igor);
        person72Queue.offer(evgeniy);

        System.out.println("person72Queue.poll() = Игорь ваша очередь " + person72Queue.poll());
        System.out.println("person72Queue.poll() = Евгений ваша очередь " + person72Queue.poll());
        System.out.println("person72Queue.poll() = Денис ваша очередь " + person72Queue.poll());
        System.out.println("person72Queue.poll() = Олег ваша очередь " + person72Queue.poll());
    }
}
