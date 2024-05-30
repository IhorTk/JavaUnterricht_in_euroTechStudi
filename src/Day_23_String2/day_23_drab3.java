package Day_23_String2;

public class day_23_drab3 {
    public static void main(String[] args) {
        String strnach = "ABCDE";
        System.out.println("Получите перевертыш:  "+ Reverse(strnach));
    }
    public static String Reverse(String strnach){
        String reverse = "";
        for (int i = 0; i < strnach.length(); i++) {
            reverse = strnach.charAt(i) + reverse;
        }
        return reverse;
    }
}
