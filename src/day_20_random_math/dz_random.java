package day_20_random_math;

import java.util.Random;

public class dz_random {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        for (int i = 0; i <= 6; i++) {
            count++;
            int randomNumber = random.nextInt(10);
            System.out.println("Случайное число= " + randomNumber);
            if (randomNumber == 3) {
                System.out.println("Ваше число выпало за    " + count + "  раз ");
                break;
            }
            if (count == 6){
                System.out.println("И снова мимо : число 3 не выпало за 6 попыток");
                break;
            }
        }

    }
}
