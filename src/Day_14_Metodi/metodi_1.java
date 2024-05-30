package Day_14_Metodi;

public class metodi_1 {
    public static void main(String[] args) {
        System.out.println(" Pered metodom");
        displayMesage();
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Summa do chisla 10 =  " + sum);
        int sum1 = 0;
        for (int i = 20; i <= 50; i++) {
            sum1 = sum1 + i;
        }
        System.out.println("Summa ot 20 do  50 =  " + sum1);

        int sum2 = 0;
        for (int i = 50; i <= 100; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("Summa ot 50 do 100 =  " + sum2);
    }

    public static void displayMesage() {
        System.out.println("Privet World!");
        calculation();
    }
    public static void calculation(){
        System.out.println(10+5-3);

    }
}
