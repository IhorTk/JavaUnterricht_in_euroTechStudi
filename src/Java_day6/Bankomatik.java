package Java_day6;
import java.util.Scanner;

public class Bankomatik {
    public static void main(String[] args) {
        String name = "Oleg";
        String password = "12345";
        double balans = 1000.00;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String name1= scanner1.nextLine();
        if (name1.equals(name)){
            System.out.println("ОК. Введите пароль");
            String password1 = scanner1.nextLine();
            if (password1.equals(password)){
                System.out.println("ОК. Ваш баланс  "+ balans);
                System.out.println("Что будете делать?");
                System.out.println("1 - Вносить; 2 - Снимать; Другой вариан - Ничего");
                int variant = scanner1.nextInt();
                if (variant == 1){
                    System.out.println("Укажите сумму");
                    double amount = scanner1.nextDouble();
                    balans += amount;
                    System.out.println("Теперь Ваш баланс  "+ balans);
                }
                if (variant ==2){
                    System.out.println("Укажите сумму");
                    double amount = scanner1.nextDouble();
                    if (balans<amount) {
                        System.out.println("На счету недостаточно средств");
                    } else {
                        balans -= amount;
                        System.out.println("Теперь Ваш баланс  "+ balans);
                    }
                }
                if (variant !=1 && variant !=2){
                    System.out.println("Досвидания. До новых встреч. Ваш баланс "+ balans);
                }
            } else {
                System.out.println("Не угадал. До новых встреч.");
            }

        }else {
            System.out.println("Не угадал. До новых встреч.");
        }

    }

}
