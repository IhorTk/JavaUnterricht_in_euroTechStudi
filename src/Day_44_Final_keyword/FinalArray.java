package Day_44_Final_keyword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalArray {
    public static void main(String[] args) {
         int[] arr1 = {1,2,3,4};
        System.out.println("Arrays.toString(arr1)  ="  + Arrays.toString(arr1));

        int[] arr2 = {10,11,12};
        System.out.println("Arrays.toString(arr2)  =" + Arrays.toString(arr2));
        arr1 = arr2;


        System.out.println("Arrays.toString(arr1)  ="  + Arrays.toString(arr1));


        final List<Integer>list = new ArrayList<>(Arrays.asList(20,21,222));
        System.out.println("list  =" + list);
        list.add(0,200);
        System.out.println("list  =" + list);

        List<Integer>list1 = new ArrayList<>(Arrays.asList(30,31,322));
        System.out.println("list1  =" + list1);

//        list=list1;
        System.out.println("list=list1   ="+list);

    }
}
