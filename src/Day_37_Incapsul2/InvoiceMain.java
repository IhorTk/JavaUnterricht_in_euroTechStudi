package Day_37_Incapsul2;

import javax.swing.*;

public class InvoiceMain {
    public static void main(String[] args) {
        Invoice iphone = new Invoice("Iphone", 1500.00, 3);
        System.out.println(iphone.getTotalPreis());
        System.out.println(iphone);
        System.out.println("=========================================================");
        Invoice androidPhone = new Invoice("AndroidPhone", 1000.00, 5);
        System.out.println("androidPhone.getTotalPrice() = " + androidPhone.getTotalPreis());
        System.out.println(androidPhone);
    }
}
