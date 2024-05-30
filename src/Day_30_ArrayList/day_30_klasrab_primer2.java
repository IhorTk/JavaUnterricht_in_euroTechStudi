package Day_30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class day_30_klasrab_primer2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A","C","B","D","F"));
        System.out.println(list1.equals(list2));

        System.out.println(list1.containsAll(list2));

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println(list1.equals(list2));

        String s1 = "ABC";
        String s2 = "ABC";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
    }
}
