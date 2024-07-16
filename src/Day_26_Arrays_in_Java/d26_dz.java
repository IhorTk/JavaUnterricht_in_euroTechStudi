package Day_26_Arrays_in_Java;

import java.util.Arrays;

public class d26_dz {
    public static void main(String[] args) {
        int[] arr ={1,2,5,3,-6,15,4,5,6,4,-6,5,7,8,-6,9,10,4,25};
        System.out.println("Массив   " + Arrays.toString(arr));
        System.out.println("Максимальное значение в массиве:   " + findMax(arr));
        System.out.println("Минимальное значение в массиве:    " + findMin(arr));
        System.out.println("Повторяющиеся элементы в массиве:  " + findDublicate(arr));
        showDublicate(arr);





    }
    public static int findMax(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static String findDublicate(int[] arr){
        String dubli ="";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j])
                    dubli = (dubli+"  " + arr[i]);
            }
        }
        return dubli;
    }
    public static void showDublicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i !=1){
                    System.out.print(arr[j]+ "  ");
                }
            }
        }
    }
}
