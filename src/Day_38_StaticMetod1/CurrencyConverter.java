package Day_38_StaticMetod1;

import java.time.LocalDate;

public class CurrencyConverter {
    public static final double USD_TO_EUR_RATE = 0.92;
    private static final double USD_TO_JPY_RATE = 146.35;

    public static double convertToEUR(double amountInUSD) {
        return amountInUSD * USD_TO_EUR_RATE;
    }

    public static double convertToJPY(double amountInUSD) {
        return amountInUSD * USD_TO_JPY_RATE;
    }

    public static void main(String[] args) {
        System.out.println("CurrencyConverter.USD_TO_EUR_RATE = " + CurrencyConverter.USD_TO_EUR_RATE);
        double amountInUSD = 100.0;
        double amountInEUR = CurrencyConverter.convertToEUR(amountInUSD);
        double amountInJPY = CurrencyConverter.convertToJPY(amountInUSD);
        System.out.printf("%s USD эквивалентно (на %s):%n%s EUR%n%s JPY",
                amountInUSD, LocalDate.now(), amountInEUR, amountInJPY);
    }
}
