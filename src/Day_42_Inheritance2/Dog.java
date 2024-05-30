package Day_42_Inheritance2;


import java.util.Date;

public class Dog extends Animal{
    private Date data2;
    public void bark(){
        System.out.println(getData1() + " облаял соседей");
    }

    public Dog(Date data1, Date data2) {
        super(data1);
        this.data2 = data2;
    }

    public Date getData2() {
        return data2;
    }

    public void setData2(Date data2) {
        this.data2 = data2;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "data2=" + data2 +
                '}';
    }

    @Override
    public void move() {
        super.move();
    }
}
