package Day_54_Collection_Set;

import java.util.*;

public class CollectionEx {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(6);
        set.add(4);

        System.out.println("Collections.max(set) = " + Collections.max(set));
        System.out.println("=========================================================");
        ArrayList<Integer> list = new ArrayList<>();
        Random ran = new Random();

        for (int i = 0; i <= 50; i++) {
            int bb = ran.nextInt(400 - 100) + 100;
            list.add(bb);
        }
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);

        Collections.shuffle(list);
        System.out.println("list = " + list);

        List<Integer> binList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("Collections.binarySearch(binList, 3) = " + Collections.binarySearch(binList, 3));

    }
}
