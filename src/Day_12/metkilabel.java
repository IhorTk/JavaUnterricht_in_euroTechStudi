package Day_12;

public class metkilabel {
    public static void main(String[] args) {
        out:
        for (int i = 1; i <= 10; i++) {
            System.out.println("внешний цикл:  " + i);
            System.out.println("============");
            in:
            for (int j = 1; j <= 10; j++) {
                System.out.println("Вложеный цикл:  " + j);
                if (j == 5) {
                    break out;
                }
            }
        }
        System.out.println("Обка цикла завершены");
    }
}


