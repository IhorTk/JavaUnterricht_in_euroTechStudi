package Day_32_Konstruktor;

public class ProbaKonstr {
    private static int num;
    public static String name;
    public static Boolean aBoolean;

    private ProbaKonstr(int num,String name,Boolean aBoolean) {
        ProbaKonstr.aBoolean=aBoolean;
        ProbaKonstr.num=num;
        ProbaKonstr.name=name;
    }

    public static int getNum() {
        return num;
    }

    public static String getName() {
        return name;
    }

    public static Boolean getaBoolean() {
        return aBoolean;
    }
}
