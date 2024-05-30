package Day_15_Metodi_2;

import java.util.Scanner;

public class dz_metod_gorka {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Hotite Gorku iz  *");
        System.out.println(" Kakoi visoti? :");
        int visota = scanner1.nextInt();
        gorka(visota);
    }
    public static void gorka( int num1){
        char kamen = '*';
        for (int i = 0; i <=num1 ; i++) {
            System.out.println();
            for (int j = 1; j <=i ; j++) {
                System.out.print(kamen);
            }
        }
    }
}
