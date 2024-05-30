package Day_32_Konstruktor;

public class Rabota {
    public static void main(String[] args) {
        SDET sdet1 = new SDET("Talscha", 34,'M', "Microsoft", 90000, true);
        System.out.println(" Уважаемая(мый) Ваше текущее положение  :");
        System.out.println(sdet1);
        System.out.println( "Ваши перспективы : ");
        System.out.println(" Новая зарплата : " + sdet1.increaseSalary(90000));
        System.out.println(" Новая компания :" + sdet1.companyChange(""));
    }
}
