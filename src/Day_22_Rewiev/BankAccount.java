package Day_22_Rewiev;

public class BankAccount {
    public String name;
    public String password;
    public double balance;


    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdrawal(double amount){
        if (balance >= amount){
            balance = balance - amount;
        }else {
            System.out.println("У вас недостаточно денег для снятия, ваш баланс " + balance + " сумма снятия " + amount );
        }
    }

    public void setName(String myName){
        name = myName;
    }

    public String getName(){
        return name;
    }


    public void setBalance(double myBalance){
        balance = myBalance;

    }

    public double getBalance(){
        return balance;
    }

    public void setPassword(String myPasword){
        password = myPasword;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}