package Day_14_Metodi;

import java.util.Scanner;

public class dz_day_14_kred {
    public static void main(String[] args) {
        System.out.println(" Hotite poluchit kredit?");
        System.out.println("Davaite proverim Vash sredniy dohod za posledniy god");
        userEligibleOrNot();
    }

    public static void userEligibleOrNot() {
        char prod;
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println(" Vvedite Vaschi dochodi za poslednie 12 mesyacev");
            double dohod = scanner1.nextDouble();
            double srdohod = dohod / 12;
            if (srdohod >= 1000) {
                System.out.println("Ok. Davaite rassmotrim Vaschu zaiavku.");
            } else {
                System.out.println("Izvinite, no Vachego dohoda ne dostatochno");
                System.out.println("Vozmogno Vi chto-to zabili ukazat.");
            }
            System.out.println("Prodolgaem?  Y/N");
            prod = scanner1.next().charAt(0);
        } while (prod == 'Y' || prod == 'y');
        System.out.println(" Do vstrechi");
    }
}
