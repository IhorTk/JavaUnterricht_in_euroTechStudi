package Day_46_Abstrakcia;

public class Ovel extends Bird {
    @Override
    void fly() {
        System.out.println("Ovel fly");
    }

    @Override
    int speed() {
        return 70;
    }

    @Override
    public void eat() {
        System.out.println("Ovel eating");
    }
}
