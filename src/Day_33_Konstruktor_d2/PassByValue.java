package Day_33_Konstruktor_d2;

public class PassByValue {
    public static void main(String[] args) {

        int x = 10;
        int y = x;
        System.out.println(x);
        changeValue(x);

        System.out.println(x);
        System.out.println(y);
    }

    static int changeValue(int x){
        return x = x+10;
    }


}
