package Day_34_Inkapsul;

public class BankAccount {
    //Переменные обьекта
    private String name;
    private double balance;

    private String accountType;

    public void displaybalance(){
        System.out.println("Ваш баланс   " + balance);
    }

    //GETTER

    public String getName(){
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public  String getAccountType(){
        return accountType;
    }
    //SETTER
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

}
