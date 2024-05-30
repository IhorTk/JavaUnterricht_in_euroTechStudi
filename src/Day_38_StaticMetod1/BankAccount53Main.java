package Day_38_StaticMetod1;

public class BankAccount53Main {
    public static void main(String[] args) {
        BankAccount53 bankAccount1 = new BankAccount53(1000);
        BankAccount53 bankAccount2 = new BankAccount53(2000);


        System.out.println("bankAccount1.calculateInterest(0.05)=  " + bankAccount1.calculateInterest(0.05));
        System.out.println("bankAccount2.calculateInterest(0.05)=  " + bankAccount2.calculateInterest(0.05));

        System.out.println("BankAccount53.getTotalInterest() = "  + BankAccount53.getTotalInterest());

        System.out.println("bankAccount1.getTotalInterest() = " + bankAccount1.getTotalInterest());
    }
}
