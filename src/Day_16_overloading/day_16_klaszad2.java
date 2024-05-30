package Day_16_overloading;
import java.util.Scanner;
public class day_16_klaszad2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите любое слово ");
        String word = scanner.nextLine();
        System.out.println("Количество гласных букв - " + countVowels(word));
    }

    private static int countVowels(String word) {
        String alfabet = "аеёийоуыэюяАЕЁИЙОУЫЭЮЯ";
        int countVowels = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            for (int j = 0; j < alfabet.length(); j++) {
                char letterAlfabet = alfabet.charAt(j);
                if (letterAlfabet == letter) {
                    countVowels++;
                }
            }
        }
        return countVowels;
    }
}