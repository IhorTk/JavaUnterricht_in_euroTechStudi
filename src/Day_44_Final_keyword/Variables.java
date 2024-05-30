package Day_44_Final_keyword;

public class Variables {
   final int num1 = 11;// переменная экземпляра
    final static int STAT_NUM = 100;//статическая переменная или переменная класса

    public Variables(){
        int num2 =22;//локальная переменная
        System.out.println("num2   "+num2);
    }

    public void instsnseMetod(){
        int num3 =33; //локальная переменная
        System.out.println("num3  "+ num3);
    }

    public static void staticMetod(){
        System.out.println("Статический метод");;
    }

    {
        int num4 =44;
        System.out.println("num4  " + num4);
    }

    public static void main(String[] args) {
        Variables obj1 = new Variables();
        Variables obj2 = new Variables();
        Variables obj3 = new Variables();
        System.out.println("obj1.num1  " + obj1.num1);
        System.out.println("obj2.num1  " + obj2.num1);
        System.out.println("obj3.num1  " + obj3.num1);

    }

}
