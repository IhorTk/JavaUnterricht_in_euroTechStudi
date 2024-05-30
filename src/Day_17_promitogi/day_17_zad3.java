package Day_17_promitogi;

public class day_17_zad3 {
    public static void main(String[] args) {
        System.out.println(countchisel("25324829"));
    }

    private static int countchisel(String chislo) {
        int countchisel = 0;
        for (int i = 0; i < chislo.length(); i++) {
            char num = chislo.charAt(i);
            if (num == '2') {
                countchisel++;
            }
        }
        return countchisel;
    }
}
