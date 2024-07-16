import java.util.Scanner;

public class FibonachiChisla {
    public static void main(String[] args) {
        int kolvo, start, start1;
        System.out.println("Расчет числовой последовательности Фибоначчи");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число последовательности");
        start = scanner.nextInt();
        System.out.println("Введите второе число последовательности");
        start1 = scanner.nextInt();
        System.out.println("Введите количество чисел в последовательности");
        kolvo = scanner.nextInt();
        System.out.println(" Ваш ответ :");

        fibonachi(kolvo,start,start1);
    }

    public static void fibonachi(int kolvo, int start, int start1){
        int doblestart = start;
        for (int i=0; i<=kolvo; i++) {
            start = doblestart;
            doblestart = start1;
            start1 = start+doblestart;
            System.out.print(start + " ");

        }
    }
}
