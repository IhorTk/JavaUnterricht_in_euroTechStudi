package Day_10;

import java.util.Scanner;

public class NestedLoopdva {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <=10;  j++) {
//            System.out.print("*");
//            }
//            System.out.println();
//        }
        // факториал
//        System.out.println("Введите любое целое положительное чило :");
//        Scanner scanner1 = new Scanner(System.in);
//        int chislo = scanner1.nextInt();
//        int pr = 1;
//        System.out.println("Факториал числа "+chislo);
//        for (int i = 1; i <= chislo; i++) {
//            pr*=i;
//            System.out.println(i + "! =" + pr);
//
//        }
        System.out.println("Введите любое целое положительное чило для которого нужно найти ФАКТОРИАЛ:");
        Scanner scanner1 = new Scanner(System.in);
        int chislo = scanner1.nextInt();
        int pr = 1;
        System.out.print("Факториал числа "+chislo +"  =  ");
        for (int i = 1; i <= chislo; i++) {
            pr *= i;
        }
            System.out.print(pr);


    }
}
