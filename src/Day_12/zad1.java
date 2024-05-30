package Day_12;

public class zad1 {
    public static void main(String[] args) {
        // 1 способ
        for (int i = 10; i <= 20; i+=2) {
            if (i == 16) {
                continue;
            }
            System.out.println("I  = " + i);
        }
        System.out.println("============");
// 2 способ
        for (int h = 10; h <= 20; h++) {
            if (h%2 == 1) {
                continue;
            }
            if (h == 16) {
                continue;
            }
            System.out.println("I  = " + h);
        }
        System.out.println("============");
        // 3 способ
        for (int b = 10; ; b+=2) {
            if (b == 16) {
                continue;
            }
            if (b>20){
                break;
            }
            System.out.println("B  = " + b);
        }
        System.out.println("============");
    }
}
