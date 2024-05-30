package Day_47_Inheritance_Project;

public abstract class CentralBank implements CB{

    private String bankName;
    private double currentBalance;
    private double finalBalance;
    private String accountType;
    private double returnRate;
    private double welcomeBonus;
    private double depositBonus;
    private double withdrawExpensce;
    private boolean isAccountCloded;
    //TODO: Добавить переменную обьект Person

    public CentralBank(String bankName, double currentBalanse, String accountType, double welcomeBonus) {
        this.bankName = bankName;
        this.currentBalance = currentBalanse + welcomeBonus;
        this.accountType = accountType;
        this.welcomeBonus = welcomeBonus;
    }

    @Override
    public void deposit(double depositvalue){
        this.currentBalance +=depositvalue;
    }

    @Override
    public void wihdraw(double withdrawvalue){
        this.currentBalance -= withdrawvalue;
    }

// method deposit
//    public void deposit(double depositvalue){
//        this.currentBalance +=depositvalue;
//    }
//
//    // method withdraw
//    public void wihdraw(double withdrawvalue){
//        this.currentBalance -= withdrawvalue;
//    }



    // method close Account
    public void closeAccount(){

        if (isAccountCloded){
            System.out.println("Вы уже закрыли свой счет");
        }else{
            System.out.println("!!!  ИДЕТ ЗАКРЫТИЕ ВАШЕГО СЧЕТА !!!" + getAccountType());
            System.out.println("Ваш конечный баланс с процентами " + getFinalBalance());
            this.currentBalance = 0;
            this.isAccountCloded = true;
            System.out.println(" Ваш счет успешно закрыт " + getAccountType());
        }
    }



    //SETTER
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setFinalBalance(double finalBalance) {
        this.finalBalance = finalBalance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }

    public void setWelcomeBonus(double welcomeBonus) {
        this.welcomeBonus = welcomeBonus;
    }

    public void setDepositBonus(double depositBonus) {
        this.depositBonus = depositBonus;
    }

    public void setWithdrawExpensce(double withdrawExpensce) {
        this.withdrawExpensce = withdrawExpensce;
    }

    public void setAccountCloded(boolean accountCloded) {
        isAccountCloded = accountCloded;
    }

    //GETTER

    public String getBankName() {
        return bankName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getFinalBalance() {
        return this.currentBalance *returnRate;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getReturnRate() {
        return returnRate;
    }

    public double getWelcomeBonus() {
        return welcomeBonus;
    }

    public double getDepositBonus() {
        return depositBonus;
    }

    public double getWithdrawExpensce() {
        return withdrawExpensce;
    }

    public boolean isAccountCloded() {
        return isAccountCloded;
    }



    @Override
    public String toString() {
        return "CentralBank{" +
                "bankName='" + bankName + '\'' +
                ", currentBalanse=" + currentBalance +
                ", finalBalance=" + finalBalance +
                ", accountType='" + accountType + '\'' +
                ", returnRate=" + returnRate +
                ", welcomeBonus=" + welcomeBonus +
                ", depositBonus=" + depositBonus +
                ", withdrawExpensce=" + withdrawExpensce +
                ", isAccountCloded=" + isAccountCloded +
                '}';
    }
}
