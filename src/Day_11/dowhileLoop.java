package Day_11;

import java.util.Scanner;

public class dowhileLoop {
    public static void main(String[] args) {
//        boolean ent5 = false;
//        do{
//            System.out.println(" ****  ");
//        } while ( ent5 );
//        System.out.println(" ======================= ");
//
        int count = 0, sum = 0;
        System.out.println(" Введите целое число ");
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();
        do{
            System.out.print(count);
            sum = sum + count;
            count++;
        } while (num1>=count);
        System.out.println("Сумма всех чисел до "+ num1 + "(включительно) равно =  " + sum);

//        int count = 0, sum = 0;
//        System.out.println(" Введите целое число ");
//        Scanner scanner1 = new Scanner(System.in);
//        int num1 = scanner1.nextInt();
//        while (num1 > count) {
//            count++;
//            sum = sum + count;
//        }
//        System.out.println("Сумма всех чисел до " + num1 + "(включительно) равно =  " + sum);
    }
}

