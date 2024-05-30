package Day_12;

public class zad2 {
    public static void main(String[] args) {
        // 1 способ
        int i= 8;
        while (i < 20){
            i+=2;
           if (i == 16) {
                continue;
            }
            System.out.println("I  = " + i);
        }
        System.out.println("============");
// 2 способ
        int h = 8;
        while (h < 20){
            h++;
            if (h%2 == 1) {
                continue;
            }
            if (h == 16) {
                continue;
        }
        System.out.println("H  = " + h);
        }
        System.out.println("============");
        // 3 способ
        int b = 8;
        while (true){
           b+=2;
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
