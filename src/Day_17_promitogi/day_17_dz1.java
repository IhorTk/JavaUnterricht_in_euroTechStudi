package Day_17_promitogi;

import java.util.Scanner;

public class day_17_dz1 {
    public static void main(String[] args) {
        System.out.println("Простой калькулятор");
        System.out.println(" Введите такие выражения как 2 + 2 или 3.14 * 7.8.");
        System.out.println(" Используя : +, -, *, /.");
        System.out.println(" Выйти из калькулятора введите 0 ");
        var scanner = new Scanner(System.in);
        String viragenie = scanner.nextLine();
        int index = viragenie.indexOf(' ');
        String num1 = viragenie.substring(0, index);
        String operator = viragenie.substring(index + 1, index + 2);
        int index1 = viragenie.indexOf(operator + ' ');
        String num2 = viragenie.substring(index1 + 1);
        Double num11 = Double.parseDouble(num1);
        Double num21 = Double.parseDouble(num2);
        String res;
        switch (operator) {
            case "/":
                if (num21 == 0.00) {
                    res = "На  0 делить нельзя";
                    break;
                } else {
                    res = Double.toString(num11 / num21);
                }
                break;
            case "-":
                res = Double.toString(num11 - num21);
                break;
            case "*":
                res = Double.toString(num11 * num21);
                break;
            default:
                res = Double.toString(num11 + num21);
        }
        System.out.println("Результат вычисления   " + res);
        System.out.println("+++++++");

    }

}
