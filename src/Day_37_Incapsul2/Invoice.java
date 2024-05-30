package Day_37_Incapsul2;

import java.time.LocalDateTime;

public class Invoice {
    private int invNumer = 1000;
    private LocalDateTime invDateTime;
    private String companyNameFrom = "EuroTechStudy";
    private double prise;
    private int amount;
    private String produktName;
    private static int count = 0;

    /*
    1- При офромлении счет фактуры , номер счет фактуры должно начаться с 1000 и должно автомастически присвоится
    номер С-Ф
    2 - При офромлении счет фактуры , дата должна автомастически присвоится
    3 - Название фирмы всегда должно указываться при офрмлении
    4 - При оформлении С-Ф , должно автоматически посчитать общую стоимость
     */

    public Invoice(String produktName, double prise, int amount) {
        this.produktName = produktName;
        this.invNumer = count + invNumer;
        count++;
        this.prise = prise;
        this.amount = amount;
        this.invDateTime = invDateTime;

    }

    public double getTotalPreis() {
        return prise * amount;
    }

    public int getInvNumer() {
        return invNumer;
    }

    public void setInvNumer(int invNumer) {
        if (String.valueOf(invNumer).length() < 3)
            System.out.println("Номер должен быть четырех значным");
        this.invNumer = invNumer;
    }

    public LocalDateTime getInvDateTime() {
        return invDateTime;
    }

    public void setInvDateTime(LocalDateTime invDateTime) {
        this.invDateTime = invDateTime;
    }

    public String getCompanyNameFrom() {
        return companyNameFrom;
    }

    public void setCompanyNameFrom(String companyNameFrom) {
        this.companyNameFrom = companyNameFrom;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProduktName() {
        return produktName;
    }

    public void setProduktName(String produktName) {
        this.produktName = produktName;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Invoice.count = count;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invNumer=" + invNumer +
                ", invDateTime=" + invDateTime +
                ", companyNameFrom='" + companyNameFrom + '\'' +
                ", prise=" + prise +
                ", amount=" + amount +
                ", produktName='" + produktName + '\'' +
                '}';
    }
}
