package Day_11;
import java.util.Scanner;

public class whilleLoop {
  public static void main(String[] args) {
    System.out.println(" Введите 2 числа 0<А<B ");
    System.out.println(" Введите целое число ");
    Scanner scanner1 = new Scanner(System.in);
    int num = scanner1.nextInt();
    int num2 = 0;
    System.out.println(" Введите второе целое число ");
    int num1 = scanner1.nextInt();
      while (num <= num1) {
//        if (num2%2 == 0){
         System.out.print(num*num +" ");
//         }
        num++;
     }
  }
}
