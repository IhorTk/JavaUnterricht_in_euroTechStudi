package Day_52_Trow_Example;

public class TrowExample {
    public static void main(String[] args) {

        try {
            divide(5,0);
        } catch (Exception e) {
            System.out.println(e);;
        }


    }
    static void divide(int num1, int num2){
        System.out.println("Do");
        try {
            if(num2 == 0){
                throw new ArithmeticException("Деление на ноль");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Posle ruchnogo");
        int result = num1/num2;
        System.out.println("Posle");
    }
}
