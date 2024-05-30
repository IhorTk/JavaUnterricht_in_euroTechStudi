package Day_30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class day30_klasrab4 {
    public static void main(String[] args) {
        ArrayList<String> listOne1 = new ArrayList<>(Arrays.asList("A","B","C","D","C","E"));
        ArrayList<String> listTwo1 = new ArrayList<>(Arrays.asList("A","C","C","D","D","B","D","F","F"));
        // 1 sposob vivoda c for
        for (int i = 0; i < listTwo1.size(); i++) {
            System.out.print(listTwo1.get(i)+ " ");
        }
        System.out.println();

        // 2 sposob s for-each

        for (String l: listTwo1){
            System.out.print(l+ " ");
        }
        System.out.println();

        for (int i = 0; i < listTwo1.size(); i++) {
            if (listTwo1.get(i) == "F"){
                listTwo1.remove("F");
            }

        }
        System.out.println(listTwo1);

//        Iterator<String> iterator = listTwo1.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            if (next == "D" || next == "C"){
//                iterator.remove();
//            }
//        }
//        System.out.println(listTwo1);

//        listTwo1.removeAll(Collections.singleton("D"));
//        System.out.println(listTwo1);

    }

}
