package Day8;
import java.util.Scanner;
public class vremiagoda {
    public static void main(String[] args) {
        Scanner scaner22 = new Scanner(System.in);
        System.out.println("Введите номер месяца :");
        byte mes= scaner22.nextByte();
        switch (mes){
            case 12,1,2:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого времени года");
        }
    }
}
