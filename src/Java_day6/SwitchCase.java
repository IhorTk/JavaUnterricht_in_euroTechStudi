package Java_day6;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите 1 число");
        int month=scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
        }
    }
}
