package Day_38_StaticMetod1;

public class BankAccount53 {
    private double balance;
    private static double totalInterest = 0.0; // Стат переменная для отслеживания общей суммы %

    public BankAccount53(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance = balance+amount;
    }
    public void withdraw(double amount){
        if (balance>=amount){
            balance = balance - amount;
        }else{
            System.out.println("Недостаточно денег");
        }
    }

    public double calculateInterest(double rate){
        double interest = balance * rate;
        totalInterest = totalInterest + interest; // увеличиваем значение статической переменной
        balance = balance + interest;
        return interest;
    }

    public static double getTotalInterest() {
        BankAccount53 bankAccount53 = new BankAccount53(50);
        System.out.println(bankAccount53.balance);
        return totalInterest;
    }

}
