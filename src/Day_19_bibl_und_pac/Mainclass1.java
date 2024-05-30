package Day_19_bibl_und_pac;

import java.util.Scanner;

public class Mainclass1 {
    public static void main(String[] args) {
        StatCalkulator calculator = new StatCalkulator();
        Scanner scanner = new Scanner(System.in);
        double number = 1;
        while ((number != 0)) {
            System.out.println("Введите дробное число:   ");
            number = scanner.nextDouble();
            if (number != 0) {
                calculator.enter(number);
            }
        }
        System.out.println(" Количество введенных чисел:  " + calculator.getCount());
        System.out.println(" Сумма введенных чисел: " + calculator.getSum());
        System.out.println(" Максимальное число:    " + calculator.getMax());
        System.out.println(" Минимальное число:    " + calculator.getMin());
        System.out.println(" Среднее значение:    " + calculator.getAverage());

    }
}
