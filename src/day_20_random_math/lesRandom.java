package day_20_random_math;

import java.util.Random;

public class lesRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt();
        System.out.println("Случайное число в диапазоне значения int:  " + randomInt);
        int randomLimited = random.nextInt( 10);
        System.out.println("Случайное число в диапазоне от 0 до 9 :  " + randomLimited);
        double randomDoobly = random.nextDouble();
        System.out.println("Случайное число в диапазоне Doubly от 0 до 1:  " + randomDoobly);
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Случайное значение Boolean :  " + randomBoolean);
        int minZnach = 5;
        int maxZnach = 10;
        int result = random.nextInt(maxZnach - minZnach)+minZnach;
        System.out.println("Случайное значение в диапазоне значений 5  - 10 :  " + result);


    }
}
