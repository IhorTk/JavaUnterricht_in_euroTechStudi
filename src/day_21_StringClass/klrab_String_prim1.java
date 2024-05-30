package day_21_StringClass;

import java.util.Scanner;

public class klrab_String_prim1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свои Имя и Фамилию через пробел");
        String fio = scanner.nextLine();
        System.out.println("  Буква        ASII   ");
        for (int i = 0; i < fio.length(); i++) {
            System.out.println();
            System.out.print("" + i  + "     " + fio.charAt(i) + "        ");
            System.out.print(0 + fio.charAt(i));
        }
    }

}
