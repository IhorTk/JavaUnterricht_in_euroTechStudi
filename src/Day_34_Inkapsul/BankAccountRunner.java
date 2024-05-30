package Day_34_Inkapsul;

public class BankAccountRunner {
    public static void main(String[] args) {

        BankAccount oleg = new BankAccount();
        System.out.println("oleg.getName() =  " + oleg.getName());
        oleg.setName("Oleg");
        System.out.println("oleg.getName() =  " + oleg.getName());
        oleg.displaybalance();



    }
}
