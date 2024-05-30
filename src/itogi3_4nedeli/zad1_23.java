package itogi3_4nedeli;

import java.util.Scanner;

public class zad1_23 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное чило:");
        Scanner scanner1 = new Scanner(System.in);
        int chislo = scanner1.nextInt();
        int pr = 0;
//        System.out.print("Сумма всех чисел до "+chislo +"  =  ");
//        for (int i = 1; i <= chislo; i++) {
//            pr += i;
//        }
//        System.out.print(pr);

        for (int i=1; i <= 10; i++){
            pr = i* chislo;
            System.out.println(i + "*"+chislo + " = " +pr);
        }
        System.out.print("Все");
    }
}
