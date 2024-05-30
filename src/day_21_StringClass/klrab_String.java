package day_21_StringClass;

public class klrab_String {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Mango";
        String s3 = "Apple";

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        String s4 = new String("Hallo");
        String s5 = new String("Hallo");

        System.out.println(s4==s5);

        String first = new String("Hallo World");
        int length = first.length();
        System.out.println(length);

        char c = first.charAt(1);
        int c1 = first.charAt(1);
        System.out.println(c + "   " + c1);






    }

}
