package day_20_random_math;

import java.util.Random;

public class klas_zad_random1 {
    public static void main(String[] args) {
        Random random = new Random();
        while (true){
            int randomNum = random.nextInt(100);
            System.out.println("Число компьютера :  " + randomNum);
            if (randomNum > 90){
                System.out.println(" Число компьютера больше 90. СТОП!!!");
                break;
            }
        }
    }
}
