package Day_9;

import java.util.Scanner;

public class DZDay9 {
    public static void main(String[] args) {
        System.out.println("Добрый день. Давайте проверим является ли число правильным");
        System.out.println("Введите любое целое положительное чило :");
        Scanner scanner1 = new Scanner(System.in);
        int chislo = scanner1.nextInt();
        int modus = 0;
        if (chislo == 1) {
            System.out.println("Число простое");
        } else if (chislo % 2 == 0) {
            System.out.println("Число простое");
        } else {
            for (int prov = 2; chislo >= prov; ++prov) {
                if (chislo % prov == 0) {
                    System.out.println("Число составное");
                    break;
                } else if (chislo % 2 == 0) {
                    System.out.println("Число составное");
                    break;
                } else {
                    System.out.println("Число простое");
                    break;
                }
            }            }
        }
    }
