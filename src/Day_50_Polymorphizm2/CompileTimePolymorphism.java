package Day_50_Polymorphizm2;

public class CompileTimePolymorphism {
public int add(int a, int b){
    return a+b;
}
public int add(int a, int b, int c){
    return a+b+c;
}

    public static void main(String[] args) {
        CompileTimePolymorphism calkulator = new CompileTimePolymorphism();
        // Compile-time полиморфизм (метод определяется во время компиляции)
        int sum1 = calkulator.add(5,10);
        int sum2 = calkulator.add(5,10, 15);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }

}
