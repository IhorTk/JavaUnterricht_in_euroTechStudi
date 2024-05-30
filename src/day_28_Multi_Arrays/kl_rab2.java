package day_28_Multi_Arrays;

import java.util.Arrays;

public class kl_rab2 {
    public static void main(String[] args) {
        int[][] klass = new int[4][5];
        System.out.println(Arrays.deepToString(klass));
        for (int i = 0; i < klass.length; i++) {
            for (int j = 0; j < klass[i].length; j++) {
                System.out.print(klass[i][j]+" ");
            }
            System.out.println();
        }
    }


}
