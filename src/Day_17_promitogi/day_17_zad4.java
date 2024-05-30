package Day_17_promitogi;

import java.util.Scanner;

public class day_17_zad4 {
    public static void main(String[] args) {
        System.out.println(" Ведите свои Имя и Фамилию через пробел");
        Scanner scanner = new Scanner(System.in);
        String namepol = scanner.nextLine();
       int index = namepol.indexOf(' ');
        String name = namepol.substring(0,index);
        String familya = namepol.substring(index+1);
        System.out.println(name + " состоит из  " + name.length() + "  символов");
        System.out.println(familya + " состоит из  " + familya.length() + "  символов");
        System.out.println("Инициалы  " + name.charAt(0) + " " +familya.charAt(0));
    }

}
