package Day_30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class day_30_klasrab_primer3 {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("A","B","C","D","C","E"));
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("A","C","B","D","F","F"));
        //удаление всех елементов в списке
        System.out.println(listOne);//до удаления
        System.out.println(listTwo);

        listOne.removeAll(listTwo);
        System.out.println(listOne);//После удаления
        System.out.println(listTwo);

        //Вывод общих элементов

        ArrayList<String> listOne1 = new ArrayList<>(Arrays.asList("A","B","C","D","C","E"));
        ArrayList<String> listTwo1 = new ArrayList<>(Arrays.asList("A","C","B","D","F","F"));
        // do
        System.out.println(" do  "  + listOne1);
        System.out.println(" do  " +  listTwo1);

        listOne1.retainAll(listTwo);

        System.out.println("posle  "+ listOne1);
        System.out.println("posle  " + listTwo1);


        //vivod


    }
}
