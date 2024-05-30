package itogi3_4nedeli;

import java.util.Scanner;

public class DZitogi_chisla {
    public static void main(String[] args) {
        int prod = 1;
        Scanner scanner1 = new Scanner(System.in);
        int otr,pol,nul ;
        otr = pol = nul = 0 ;
        do {
            System.out.println("Введите целое число или 0 :");
            int chislo = scanner1.nextInt();
            if (chislo < 0){
                otr++;
            } else if (chislo > 0) {
                pol++;
            } else {
                nul++;
            }
            System.out.println("Хотите продолжить 1- да, 2-нет");
            prod = scanner1.nextInt();
        }
        while (prod == 1);
        {
            {
                System.out.println("Количество положительных чисел =  " + pol);
                System.out.println("Количество отрицательных чисел =  " + otr);
                System.out.println("Количество нулей =  " + nul);
            }
        }
    }
}
