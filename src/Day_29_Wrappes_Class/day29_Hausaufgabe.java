package Day_29_Wrappes_Class;

import java.util.Arrays;

public class day29_Hausaufgabe {
    public static void main(String[] args) {
        String str1 = "d1s2l3*+/-84(6{)66g7§$%&(//)/)(/)(" ;
        System.out.println("Строка 1  : " +str1);
        String str2 = "o1///{[5{[5]7{4]\2?=%$§&" ;
        System.out.println("Строка 2  : " +str2);
        System.out.println("Числа из строки 1 :   "+ updateToDigits(str1));
        System.out.println("Cумма чисел стоки 1 :  "+ sumOfDigits(str1));
        System.out.println("Числа из строки 2 :   "+ updateToDigits(str2));
        System.out.println("Cумма чисел стоки 2 :  "+ sumOfDigits(str2));

    }
    public static int updateToDigits(String s){
        char[] chars = s.toCharArray();
        String s1 ="";
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]) == true){
                s1 = s1 + chars[i];
            }
        }
        return Integer.parseInt(s1);
    }
    public static int sumOfDigits(String s) {
        char[] chars1 = s.toCharArray();
        int sumOf = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (Character.isDigit(chars1[i]) == true) {
                sumOf = sumOf + Integer.parseInt(String.valueOf(chars1[i]));
            }
        }
        return sumOf;
    }
}