package Day_14_Metodi;

import java.util.Scanner;

public class dz_day_14_Farengeit {
    public static void main(String[] args) {
        System.out.println("Davaite perevedem gradusi po Farengeitu v gradusi po Celsiu");
       convertToCelsius();
    }

    public static void convertToCelsius() {
        System.out.println("Davaite perevedem Temperaturu po Farengeitu v Temperaturu po Celsiu");
        char prodol;
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Vvedite Temperaturu po Farengeitu");
            double tempF = scanner1.nextFloat();
            double tempC = (tempF - 32) * 5 / 9;
            System.out.println(" Temperatura po Celsiu budet ravna     "+tempC);
            System.out.println(" Hotite prodolgit   Y/N");
            prodol = scanner1.next().charAt(0);
        } while (prodol == 'Y' || prodol == 'y');
        {

            System.out.println(" Do vstrechi.");

        }
    }

}