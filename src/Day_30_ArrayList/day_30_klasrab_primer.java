package Day_30_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class day_30_klasrab_primer {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(20));
        }
        ArrayList<Integer> dublicatesList = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i)) && !dublicatesList.contains(list.get(i))){
//                dublicatesList.add(list.get(i));
//            }
//        }
        for (Integer element: list){
            if (list.indexOf(element) != list.lastIndexOf(element) && !dublicatesList.contains(element)){
                dublicatesList.add(element);
            }

        }
        System.out.println(list);
        System.out.println(dublicatesList);
    }
}
