package itogi3_4nedeli;

import java.util.Scanner;

public class dowhilecikli {
    public static void main(String[] args) {
        int prod = 1;
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Введите любые 2 положительных чила:");
            System.out.println("Введите 1 чилo:");
            int chislo = scanner1.nextInt();
            System.out.println("Введите 2 чилo:");
            int chislo2 = scanner1.nextInt();
            int sum = chislo + chislo2;
            System.out.println("Сумма введенных чисел =" + sum);
            System.out.println("Хотите продолжить 1- да, 2-нет");
            prod = scanner1.nextInt();
        }
        while (prod == 1);
        {
            {
                System.out.println("Ок закончили");
            }
        }
    }
}

