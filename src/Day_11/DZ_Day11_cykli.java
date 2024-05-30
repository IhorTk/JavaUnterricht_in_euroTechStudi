package Day_11;

import java.util.Scanner;

public class DZ_Day11_cykli {
    public static void main(String[] args) {
        System.out.println(" Введите целое число ");
        Scanner scanner2 = new Scanner(System.in);
        int vvod = scanner2.nextInt();
        System.out.println(" А вот Вам зеркальное отображение Вашего числа  ");
        while (vvod>0) {
            int viv = vvod % 10;
            vvod/=10;
            System.out.print(viv);
        }
   }
}
