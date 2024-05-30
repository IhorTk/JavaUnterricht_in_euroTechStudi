package Day_16_overloading;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class day_16_klaszad1 {
    public static void main(String[] args) {
    System.out.println(yearsUntiRetirement("Oleg", 1990));
    }


    public static String yearsUntiRetirement(String name, int yearOfbirth) {
    return  name + " vihodit na pensiu cherez " + calculateAge(60,2024,yearOfbirth) + " let";

    }
    public static int calculateAge(int age, int year, int yearOfbirth){
        return age - (year - yearOfbirth);
    }
}

