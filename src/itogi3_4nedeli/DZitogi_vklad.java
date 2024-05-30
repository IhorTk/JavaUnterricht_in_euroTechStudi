package itogi3_4nedeli;

import java.util.Scanner;

public class DZitogi_vklad {
    public static void main(String[] args) {
        int prod = 1;
        double r = 0;
        do {
            System.out.println("Хотите положить вклад в банк?");
            System.out.println("Давайте посчитаем ваш доход");
            System.out.println("Какую сумму Вы хотите положить?");
            Scanner scanner1 = new Scanner(System.in);
            double sum = scanner1.nextDouble();
            System.out.println("На какой срок (лет)?");
            double srok = scanner1.nextDouble();
            System.out.println("Какая годовая процентная ставка?");
            double stavka = scanner1.nextDouble();
            System.out.println("Как добавляются проценты к сумме вклада?");
            System.out.println("1 - Помесячно    2 - Ежегодно   3 - Не добавляется");
            int dobproc = scanner1.nextInt();
            if (dobproc == 1) {
                srok = srok * 12;
                stavka = stavka / 12 / 100;
                for (int i = 0; i < srok; i++) {
                    sum = sum + sum * stavka;
                }
                double scale = Math.pow(10, 2);
                double res = Math.ceil(sum * scale) / scale;
                System.out.println("Через указаный срок сумма вклада будет    " + res);
            } else if (dobproc == 2) {
                for (int i = 0; i < srok; i++) {
                    sum = sum + sum * stavka / 100;
                }
                double scale = Math.pow(10, 2);
                double res = Math.ceil(sum * scale) / scale;
                System.out.println("Через указаный срок сумма вклада будет    " + res);
            } else {
                sum = sum + sum * stavka / 100 * srok;
                double scale = Math.pow(10, 2);
                double res = Math.ceil(sum * scale) / scale;
                System.out.println("Через указаный срок сумма вклада будет    " + res);
            }
            System.out.println("Хотите продолжить 1- да, 2-нет");
            prod = scanner1.nextInt();
        }
        while (prod == 1);{

        }
        System.out.println("До новых встреч");
    }

}
