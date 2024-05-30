package day_21_StringClass;

import java.util.Scanner;

public class day_21_DZ {
    public static void main(String[] args) {
        char prodol;
        System.out.println("Введите слово, фразу или предложение :");
        Scanner scanner = new Scanner(System.in);
        String vvod = scanner.nextLine();
        System.out.println("Вы ввели : " + vvod.length() + "символов");
        do {
            System.out.println("Количество каких символов Вы хотите узнать ? :");
            char simvol = scanner.next().charAt(0);
            System.out.println("Количество  " + simvol + "     " + KolvoSimvol(vvod, simvol) + "  штук");
            System.out.println(" Хотите продолжить   Y/N");
            prodol = scanner.next().charAt(0);
        } while (prodol == 'Y' || prodol == 'y');
        {
            System.out.println("До встречи.");
        }
    }

    public static int KolvoSimvol(String vvod, char simvol) {
        int count = 0;
        for (int i = 0; i < vvod.length(); i++) {
            if (simvol == vvod.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}


