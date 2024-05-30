package Day_26_Arrays_in_Java;

import Day_25_Arrays_in_Java.House;

import java.util.Arrays;

public class d26_Arrays_klasrab {
    public static void main(String[] args) {
        int[] Arrayint = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(sumOfElemensOfArray(Arrayint));
//        double srznach = sumOfElemensOfArray(Arrayint)/Arrayint.length;
//        System.out.println(srznach);
//        System.out.println(contains(Arrayint, 11));
//        System.out.println(returnIndex(Arrayint, 10));
//        int[] n = copyElementsOfArray(Arrayint);
//        System.out.println(Arrays.toString(n));
//        int[] n1 = copyElementsOfArray1(Arrayint);
//        System.out.println(Arrays.toString(n1));
//        int[] int1 = Arrayint.clone();
//        System.out.println(Arrays.toString(int1));
//        int[] int2 = Arrays.copyOf(Arrayint, Arrayint.length);
//        System.out.println(Arrays.toString(int2));
           int[] Arrayint1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(Arrayint1));
        int[] nnn = insertElementToIndex(Arrayint1,5,15);

        System.out.println(Arrays.toString(nnn));
    }

    static int sumOfElemensOfArray(int[] Arrayint) {
        int sum = 0;
        for (int i = 0; i < Arrayint.length; i++) {
            sum = sum + Arrayint[i];
        }
        return sum;
    }
    public static boolean contains(int[] Arrayint, int item) {
        for (int i = 0; i < Arrayint.length; i++) {
            if (Arrayint[i] == item)
                return true;
        }
        return false;
    }
    public static int returnIndex(int[] Arrayint, int item){

        for (int i = 0; i < Arrayint.length; i++) {
            if (Arrayint[i] == item)
                return i;
        }
        return -1;
    }
    public static int[] copyElementsOfArray(int[] Arrayint){
        int[] copy =new int[Arrayint.length];
        for (int i= 0, j = copy.length -1; i<Arrayint.length; i++, j--){
            copy[j] = Arrayint[i];
        }
        return copy;
    }
    public static int[] copyElementsOfArray1(int[] Arrayint){
        int[] newArr = new int[Arrayint.length];
        for (int i = 0; i < Arrayint.length; i++) {
            newArr[i] = Arrayint[i];
        }
        return newArr;
    }
    public static int[] insertElementToIndex(int[] Arraint1, int index, int item){
        int[] newArr = new int[Arraint1.length+1];
        for (int i = 0; i< index ; i++) {
            newArr[i] = Arraint1[i];
        }
        newArr[index] = item;
        for (int i = index+1; i < newArr.length; i++) {
            newArr[i] = Arraint1[i-1];
        }
        return newArr;
    }

}

