package Day_47_Inheritance_Project;
import java.sql.SQLOutput;

public class CentralBankTest {
    public static void main(String[] args) {
       Citigroup oleg = new Citigroup(2000, "GOLD");
       oleg.deposit(2000);
       oleg.wihdraw(1000);
        System.out.println("oleg.getFinalBalance() = " + oleg.getFinalBalance());
        oleg.closeAccount();
        System.out.println(oleg);
        System.out.println("=====================================================================");

        SberBank denis = new SberBank(3000,"SAVING");
        denis.deposit(3000);
        denis.wihdraw(2000);
        System.out.println("denis.getFinalBalance() = " + denis.getFinalBalance());
        denis.closeAccount();

        System.out.println(denis);

    }



}
