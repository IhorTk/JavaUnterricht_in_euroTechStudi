package Day_42_Inheritance2;

import java.util.Date;

public class Animal {
    private Date data1;
    public void move(){
        System.out.println(data1 + "сегодня прогуливаемся");
    }
    public void eat(){
        System.out.println(data1+ "cегодня макароны");
    }

    public Animal(Date data1) {
        this.data1 = data1;
    }

    public Date getData1() {
        return data1;
    }

    public void setData1(Date data1) {
        this.data1 = data1;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "data1=" + data1 +
                '}';
    }
}
