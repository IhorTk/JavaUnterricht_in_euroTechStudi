import java.util.Scanner;

public class dz31012024 {
    public static void main(String[] args) {
        //Знакомство
        Scanner scan = new Scanner(System.in);
        System.out.println("Привет, как тебя зовут? ");
        String namep= scan.nextLine();
        System.out.println("Привет  " + namep);
        System.out.println(" Я Java, и Я могу перевести температуру по Фаренгейту в температуру по Цельсию");
        System.out.println("Хочешь попробовать введи температуру по Фаренгейту? ");
        Scanner tF = new Scanner(System.in);
        double tempF= scan.nextDouble();
        double tempC= (tempF-32)*5/9;
        System.out.println("Температура в градусах Цельсиях будет равна:     " + tempC);
        System.out.println("Интересно ?");
        System.out.println("Продолжай учиться :)");
    }
}
