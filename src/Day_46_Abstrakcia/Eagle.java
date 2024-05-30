package Day_46_Abstrakcia;

public class Eagle extends Bird{
    @Override
    void fly() {
        System.out.println("Eagle fly");

    }

    @Override
    int speed() {
        return 100;
    }

    @Override
    public void eat() {
        System.out.println("Eagle eating");
    }
}
