package day_28_Multi_Arrays;

import java.util.Arrays;

public class trimernmas {
    public static void main(String[] args) {
        // трехмерный массив
        int [][][] arr3d = new int[6][8][7];



        System.out.println(Arrays.deepToString(arr3d));
        for (int i = 0; i < arr3d.length; i++) {
            for (int j = 0; j <arr3d[i].length ; j++) {
                for (int z = 0; z < arr3d[i][j].length; z++) {
                    System.out.print(arr3d[i][j][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        // 4d massiv
        int [][][][] arr4d ={
                {
                        {
                            {1,2,3,4}
                        }
                },
                {
                    {
                                {5,6,7,8}
                    }
                },
                {
                        {
                                {9, 10, 11, 12}
                        }
                },
                {
                        {
                                {13, 14, 15, 16}
                        }
                }
        };
//        System.out.println(Arrays.deepToString(arr4d));

    }
}
