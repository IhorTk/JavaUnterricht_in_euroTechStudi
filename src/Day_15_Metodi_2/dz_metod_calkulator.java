package Day_15_Metodi_2;

import java.util.Scanner;

public class dz_metod_calkulator {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Vvedite 2 chisla :");
        double num1 = scanner1.nextDouble();
        double num2 = scanner1.nextDouble();
        System.out.println(" Prostie deistvia s nimi budut :");
        double res = Calkulator(num1, num2, '+');
        System.out.println(num1 + " + " + num2 + " = " + res);
        double res1 = Calkulator(num1, num2, '-');
        System.out.println(num1 + " - " + num2 + " = " + res1);
        double res2 = Calkulator(num1, num2, '*');
        System.out.println(num1 + " * " + num2 + " = " + res2);
        double res3 = Calkulator(num1, num2, '/');
        System.out.println(num1 + " / " + num2 + " = " + res3);
        if (num2 == 0) {
            nelzia();
        }
    }
    public static double Calkulator(double num1, double num2, char arif) {
        double result = 0;
        switch (arif) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                result = num1 / num2;
        }
        return result;
    }
    public static void nelzia() {
        System.out.println("Na nul delit nelza");
    }
    public static double convertToMili(double km) {
        double mili = km / 1.609344;
        return mili;}

}
