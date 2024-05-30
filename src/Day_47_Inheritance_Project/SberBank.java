package Day_47_Inheritance_Project;

public class SberBank extends CentralBank{
    public SberBank(double currentBalanse, String accountType) {
        super("SberBank", currentBalanse, accountType, 100);
        switch (accountType){
            case "GOLD":
                setDepositBonus(80);
                setWithdrawExpensce(70);
                setReturnRate(1.3);
                break;
            case "SAVING":
                setDepositBonus(90);
                setWithdrawExpensce(60);
                setReturnRate(1.2);
                break;
            case "INTEREST":
                setDepositBonus(100);
                setWithdrawExpensce(50);
                setReturnRate(1.1);
                break;
            default:
                System.out.println("!!! НЕДЕЙСТВИТЕЛЬНЫЙ ТИП СЧЕТА !!! ");
        }
    }


    @Override
    public void deposit(double depositValue) {
        if (depositValue < 3000) {
            super.deposit(depositValue);
            System.out.println("Вы пополнили свой счет на сумму "+ depositValue+", ваш текущий баланс " + getCurrentBalance());
        } else {
            super.deposit(depositValue + getDepositBonus());
            System.out.println("Вы пополнили свой счет на сумму "+ depositValue + " и ваш бонус пополнения " + getDepositBonus()+
                    ", ваш" + " текущий баланс " + getCurrentBalance());
        }
    }

    @Override
    public void wihdraw(double withdrawValue) {
        if (withdrawValue<2000){
            super.wihdraw(withdrawValue);
            System.out.println("Вы сняли со своего счета сумму "+withdrawValue+" и Ваш расход " +
                    "снятия" + getWithdrawExpensce() + ". Ваш текущий баланс" + getCurrentBalance());
        }else{
            super.wihdraw(withdrawValue+getWithdrawExpensce());
        }
    }

    @Override
    public double getFinalBalance() {
        return super.getFinalBalance();
    }

    @Override
    public void closeAccount() {
        super.closeAccount();
    }
}
