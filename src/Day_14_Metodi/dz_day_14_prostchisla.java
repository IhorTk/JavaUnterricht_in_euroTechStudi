package Day_14_Metodi;

import java.util.Scanner;

public class dz_day_14_prostchisla {
    public static void main(String[] args) {
        System.out.println("Davaite proverim prostoe chislo ili net");
        System.out.println("Vvedite celoe chislo");
        Scanner scanner = new Scanner(System.in);
        int chis = scanner.nextInt();
        boolean result = isPrime(chis);
        System.out.println(result);
        System.out.println("Prostie chisla v diapazone ot 1 do 500");
        for (int i = 1; i < 500; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean isPrime(int chis) {
        if (chis < 2) {
            return false;
        }
        for (int i = 2; i < chis; i++) {
            if (chis % i == 0) {
                return false;
            }
        }
         return true;
        }
    }

