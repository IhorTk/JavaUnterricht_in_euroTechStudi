package Day8;

import java.util.Scanner;

public class hahhhh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        byte n = scanner.nextByte();
        if (n < 0) {
            System.out.println("Число отрицательное");
        } else if (n == 0) {
            System.out.println("Число 0");
        } else {
            System.out.println("Число положительное");
        }
    }
}
