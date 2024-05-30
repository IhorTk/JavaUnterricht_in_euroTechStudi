package Day_34_Inkapsul;

public class Bank {

    private String name;
    private int accountID;
    private String accountType;
    private double balance;

    public Bank(int accountID, String accountType) {
        setAccountID(accountID);
        setAccountType(accountType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        if ( String.valueOf(accountID).length()>=5) {
            this.accountID = accountID;
        } else {
            System.out.println("Вы ввели не корректное количество символов");
        }
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if (accountType.equals("USD")|| accountType.equals("EURO")) {
            this.accountType = accountType;
        }else {
            System.out.println("Такого типа счета нет");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
