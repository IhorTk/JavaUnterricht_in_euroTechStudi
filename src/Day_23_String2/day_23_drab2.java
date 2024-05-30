package Day_23_String2;

public class day_23_drab2 {
    public static void main(String[] args) {
        String vvod = ("DDEECGDDEEEEFGGDCDDMKLRHJGHJHGJHGJKGHGKJFKGHFHGSEEZTGUKZL");
        System.out.println(Unikumchsr(vvod));
    }

    public static String Unikumchsr(String vvod) {
        String vivod = "";
        for (int i = 0; i <vvod.length(); i++) {
            char char1 = vvod.charAt(i);
            int index_char1 = vvod.substring(0, i).indexOf(char1, 0);
            int index_char1n = vvod.substring(i + 1).indexOf(char1, i);
            if (index_char1 == -1 && index_char1n == -1) {
                vivod = vivod + char1;
            }
        }
        return vivod;
    }
}

