package Day_47_Inheritance_Project;

public class Citigroup extends CentralBank {
    public Citigroup(double currentBalance, String accountType) {
        super("Citigroup", currentBalance, accountType, 120);
        switch (accountType) {
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
                System.out.println("!!! НЕДЕЙСТВИТЕЛЬНЫЙ ТИП СЧЕТА !!!");
        }
    }


    @Override
    public void deposit(double depositValue) {
        //TODO: реализовать функцию для ввода depositValue со стороны клиента
        if (depositValue < 2000) {
            super.deposit(depositValue);
            System.out.println("Вы пополнили свой счет на сумму "+ depositValue+", ваш текущий баланс " + getCurrentBalance());
        } else {
            super.deposit(depositValue + getDepositBonus());
            System.out.println("Вы пополнили свой счет на сумму "+ depositValue + " и ваш бонус пополнения " +
                    getDepositBonus()+", ваш" + " текущий баланс " + getCurrentBalance());
        }
    }

    @Override
    public void wihdraw(double withdrawValue) {
        // TODO: ПРОВЕРИТЬ СУММУ СНЯТИЯ , ЕСЛИ БОЛЬШЕ ТЕКУЩЕГО БАЛАНСА , ВЫВЕСТИ СООБЩЕНИЕ , НЕДОСТАТОЧНЫХ СРЕДСТВ
        //TODO: реализовать функцию для ввода depositValue со стороны клиента
        //TODO: реализовать функцианольность с объектом персон
        if (withdrawValue<1000){
            super.wihdraw(withdrawValue);
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
