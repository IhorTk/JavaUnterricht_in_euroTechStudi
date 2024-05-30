package day_21_StringClass;

import java.util.Scanner;

public class klrab_String_prim2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свои Имя и Фамилию через пробел");
        String fio = scanner.nextLine();
        String alfabet = "аеёийоуыэюяАЕЁИЙОУЫЭЮЯ";
        System.out.print(" Глассные буквы :  ");
        for (int i = 0; i < fio.length(); i++) {
            char letter = fio.charAt(i);
            for (int j = 0; j < alfabet.length(); j++) {
                char letterAlfabet = alfabet.charAt(j);
                if (letterAlfabet == letter) {
                    System.out.print(" " + letterAlfabet);
                }
            }
        }
    }
}
