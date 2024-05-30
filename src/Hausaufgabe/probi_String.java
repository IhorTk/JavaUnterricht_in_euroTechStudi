package Hausaufgabe;

public class probi_String {
    public static void main(String[] args) {
        String vvod = ("DDEEMCGDDEEEE");
        for (int i = 0; i < vvod.length(); i++) {
            char char1 = vvod.charAt(i);
            int index_char1 = vvod.substring(0, i).indexOf(char1, 0);
            int index_char1n = vvod.substring(i + 1).indexOf(char1, i);
            System.out.println(char1 + "    " + vvod.substring(0,i)+ "    " + index_char1 + "    " + vvod.substring(i+1) + "    " + index_char1n);

        }



    }
}
