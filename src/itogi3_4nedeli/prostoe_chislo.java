package itogi3_4nedeli;

import java.util.Scanner;

public class prostoe_chislo {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int chis = scanner.nextInt();
        int mod = 0;
        boolean prover = true;
        for (int i = 2; i < chis; i++) {
            mod = chis % i;
            if (mod == 0) {
                prover = false;
                break;
            }
        }
        if (prover) {
            System.out.println(chis + "   Простое число");
        } else {
            System.out.println(chis + "   Составное число");
        }
    }
}
