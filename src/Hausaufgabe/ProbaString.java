package Hausaufgabe;

public class ProbaString {
    public static void main(String[] args) {
        String str = "GaStRoaNoMaiA";
        String str1 = new String("GaStRoNoMiA");
        String str2 = new String("gastronomia");
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf(1));
        System.out.println(str.indexOf('a',4));
        System.out.println(str.indexOf('a',0,10));


    }
}
