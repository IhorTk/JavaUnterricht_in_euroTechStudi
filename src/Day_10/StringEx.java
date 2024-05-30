package Day_10;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "I loved you and I trusted you so well, so why, oh why, oh why?";
        str1.charAt(8);
        int length = str1.length();
        System.out.println("Длина строки" + length);
        int i1 = str1.indexOf("o");
        System.out.println("Индекс буквы I-->" + i1);

    }
}
