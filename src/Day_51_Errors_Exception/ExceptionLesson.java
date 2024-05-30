package Day_51_Errors_Exception;

public class ExceptionLesson {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 0;

        double result = num1 / num2;
        System.out.println("result = " + result);
        int[] arr = {1, 2, 3, 4};
        divide(10, 0, arr);


//        arrayOutOfBond(arr);


    }

    static void divide(int num1, int num2, int[] arr) {
        System.out.println("Do");

        try {

            int result = num1 / num2;

            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println(arr[i]);
            }

        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println(e);
        }finally {

        }

        System.out.println("Posle");
    }
}
