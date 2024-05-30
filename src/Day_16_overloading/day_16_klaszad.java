package Day_16_overloading;

public class day_16_klaszad {
    public static void main(String[] args) {
    System.out.println(proverka1(15,25));
    System.out.println(proverka1(123,156));
    System.out.println(proverka1(123,13));

    }
    public static boolean proverka1( int num1, int num2){
        if (num1%10 == num2%10){
            return true;
        }
        return false;

    }
}
