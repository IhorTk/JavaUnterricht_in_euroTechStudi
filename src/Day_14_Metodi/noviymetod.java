package Day_14_Metodi;

import java.util.Scanner;

public class noviymetod {
    public static void main(String[] args) {

        greaterNumber(15,25,9);
    }

    public static void greaterNumber(int num1, int num2, int num3) {
//        System.out.println("Vvedite tri chisla");
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " Bolschee chislo ");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + "  Bolschee chislo");
        } else {
            System.out.println(num3 + "  Bolschee chislo");
        }
    }
//        sumOfNumbers(num1,num2,num3);

    public static void sumOfNumbers(int num1, int num2, int num3) {
        int sum = num1+num2+num3;
        System.out.println(" Summa chisel ravna  = " + sum );
    }


}