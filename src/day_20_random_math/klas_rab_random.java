package day_20_random_math;

import java.util.Random;
import java.util.Scanner;

public class klas_rab_random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        while (true){
            count++;
            System.out.println("Введите целое число:  ");
            int scannerNum = scanner.nextInt();
            System.out.println("Ваше введеннон число с клавиатуры =  " + scannerNum);
            int randonNum = random.nextInt( 10 - 1) + 1;
            System.out.println("Случайное число генерируемое компьютером = " + randonNum);
            if (scannerNum == randonNum){
                break;
            }
        }
        System.out.println("Вы угадали число с  " + count +  "раза");
    }
}
