package Java_day6;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите 1 число");
        int a = scanner.nextInt();
        System.out.println("Введите 2 число");
        int b = scanner.nextInt();
        System.out.println("Введите 3 число");
        int c = scanner.nextInt();
        if(a>b&&a>c){
            System.out.println("Самое большое число   "+ a);
       } else if(b>a&& b>c){
            System.out.println("Самое большое число   "+ b);
        } else {
            System.out.println("Самое большое число   "+ c);
        }

    }
}
