package Java_day6;

public class Operatorsifelse {
    public static void main(String[] args) {
        //простой  if

        boolean bol =true;
        if (bol){
            System.out.println("TRUE");
        }
        // If else
        int x = 10;
        int b = 20;
        if (x>b) {
            System.out.println(" X больше чем B");
        }else {
            System.out.println(" X меньше чем B");
        }
        // if, else if
        int num1=10;
        int num2=15;
        int num3=20;

        if(num1<num2) {
            System.out.println(" NUM1 ровно =" + num1);
        }else if(num2<=num3 && num2<=num3) {
            System.out.println(" NUM2 ровно =" + num2);
        }else{
            System.out.println(" NUM1 ровно =" + num1);
        }
    }



}
