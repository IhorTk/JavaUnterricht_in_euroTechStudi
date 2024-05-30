package Java_day6;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;
public class SwCase {
    public static void main(String[] args) {
        int usd=37, eur=42, funt=48;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите валюту");
        String val= scanner.nextLine();
        switch (val){
            case "USD":
                System.out.println("USD  =  "+ usd );
                break;
            case "EUR":
                System.out.println("EUR  =  "+ eur);
                break;
            case "FUNT":
                System.out.println("FUNT  =  "+ funt);
                break;
            default:
                System.out.println("Такой валюты нет");
                        }
    }
}
