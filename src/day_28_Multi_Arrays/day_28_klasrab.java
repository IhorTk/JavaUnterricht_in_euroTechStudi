package day_28_Multi_Arrays;

import java.util.Arrays;

public class day_28_klasrab {
    public static void main(String[] args) {
        //обычный массив
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
//        System.out.println(Arrays.toString(arr));

        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        //двухмернвый массив
        int[][] arr2d = new int[3][3];
        arr2d[0][0] = 100;
        arr2d[0][1] = 200;
        arr2d[0][2] = 300;

        arr2d[1][0] = 400;
        arr2d[1][1] = 500;
        arr2d[1][2] = 600;

        arr2d[2][0] = 700;
        arr2d[2][1] = 800;
        arr2d[2][2] = 900;

//        System.out.println(arr2d[0][0]);
//        System.out.println(Arrays.deepToString(arr2d));
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }
//
//        String[][] arrInit = {{"a","b"},{"c","d"}};
//        String[][] arrInit1 = new String[2][2];
//        System.out.println(Arrays.deepToString(arrInit));
//        System.out.println(Arrays.deepToString(arrInit1));
//
        //Неровные массивы
        int[][] arrSize = new int[3][];
        arrSize[0] =new int[2];
        arrSize[1] =new int[3];
        arrSize[2] =new int[4];
        for (int i = 0; i < arrSize.length; i++) {
            for (int j = 0; j < arrSize[i].length; j++) {
                System.out.print(arrSize[i][j]+" ");
            }
            System.out.println();
        }
        int[][] arrSize1 = {{1},{1,2},{1,2,3,4},{1,2,3,4,5},{10,20,30,40,50},{}};
        for (int i = 0; i < arrSize1.length; i++) {
            for (int j = 0; j < arrSize1[i].length; j++) {
                System.out.print(arrSize1[i][j]+" ");
            }
            System.out.println();
        }


    }
}
