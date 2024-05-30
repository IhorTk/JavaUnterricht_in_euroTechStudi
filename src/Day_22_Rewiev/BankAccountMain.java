package Day_22_Rewiev;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount evgeniy = new BankAccount();
        evgeniy.setName("Evgeniy");
        evgeniy.setPassword("123");
        evgeniy.setBalance(1000);

        starProgram("123","Evgeniy", evgeniy);

    }
    public static void starProgram(String password, String name, BankAccount bankAccount){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        name = scanner.nextLine();
        System.out.println("Введите ваш пароль");
        password = scanner.nextLine();
        if (name.equals(bankAccount.name) && password.equals(bankAccount.password)){
            System.out.println("Вы успешно прошли аутентификацию");
            System.out.println("Для вложения денег нажмите 1 или снятия  нажмите 2");
            int operation = scanner.nextInt();
            switch (operation){
                case 1:{
                    System.out.println("Введите сумму вложения");
                    double amount = scanner.nextDouble();
                    bankAccount.deposit(amount);
                    System.out.println("ВЫ УСПЕШНО ПОЛОЖИЛИ ДЕНЬГИ НА СВОЙ СЧЕТ, СУММА ВЛОЖЕНИЯ  " + amount +
                            ",    Ваш баланс   " + bankAccount.getBalance());
                }
                case 2:{
                    System.out.println("Введите сумму снятия");
                    double amount = scanner.nextDouble();
                bankAccount.withdrawal(amount);
                System.out.println(name + "сумма снятия  " + amount + "Ваш новый баланс   " + bankAccount.getBalance());
                break;
                }
                default:
                    System.out.println();
            }
        } else {
            System.out.println("Введена неправильная операция");
        }
    }
}
