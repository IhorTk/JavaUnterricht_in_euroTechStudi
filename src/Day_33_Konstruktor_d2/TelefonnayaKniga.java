package Day_33_Konstruktor_d2;

import java.util.Arrays;

public class TelefonnayaKniga {
    Phone[] data;
    int countData;

    public TelefonnayaKniga() {
        this.data = new Phone[1];
        this.countData = 0;
    }

    private int findName(String name) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].name.equals(name))
                return i;
        }
        return -1;
    }

    public String getNumber(String name) {
        int index = findName(name);
        if (index == -1) {
            return null;
        } else {
            return data[index].number;
        }
    }

    public void saveNumber(String name, String number) {
        if (name == null || number == null) {
            System.out.println("Имя и номер не могут быть нулевыми значениями ");
        }
        int index = findName(name);
        if (index >= 0) {
            data[index].number = number;
        } else {
            if (data.length == countData) {
                data = Arrays.copyOf(data, 2 * data.length);
            }
            Phone newPhone = new Phone(name, number);
            data[countData] = newPhone;
            countData++;

        }
    }

    public static void main(String[] args) {
        TelefonnayaKniga telefonnayaKniga = new TelefonnayaKniga();
        Phone phone1 = new Phone("Beck", "1111");
        telefonnayaKniga.data[telefonnayaKniga.countData] = phone1;

        telefonnayaKniga.saveNumber("Oleg", "2222");
        telefonnayaKniga.saveNumber("Denis", "3333");
        telefonnayaKniga.saveNumber("Igor", "4444");

        System.out.println(telefonnayaKniga.getNumber("Oleg"));

        Phone[] spisokKontaktov = telefonnayaKniga.data;

        for (Phone tel : spisokKontaktov) {
            System.out.println(tel);
        }

    }
}
