package Day_23_String2;

public class day_23_drab1 {
    public static void main(String[] args) {
        String vvod = ("DDEEGDDUEEFEEFGGDCDD");
        System.out.println(Sortirovka(vvod));
        System.out.println(removeDublicate(vvod));

    }
    public static String Sortirovka(String vvod){
        String vivod = "";
        for (int i = 0; i < vvod.length(); i++) {
            char char1 = vvod.charAt(i);
            int index_char1 = vvod.indexOf(char1, 0);
            if (index_char1 == i) {
              vivod = vivod +char1;
            }
        }
        return vivod;
    }
    static String removeDublicate(String vvod){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < vvod.length(); i++) {
            char c = vvod.charAt(i);
            int index = vvod.indexOf(c, i+1);
            if (index == -1){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
