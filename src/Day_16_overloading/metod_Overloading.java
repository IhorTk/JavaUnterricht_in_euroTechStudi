package Day_16_overloading;

public class metod_Overloading {
    public static void main(String[] args) {
        int res = sum0TwoNumber(11);
        System.out.println(res);
    }

    public static int sum0TwoNumber(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum0TwoNumber(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static int sum0TwoNumber(int num1){
        return num1*num1;
        }
}
