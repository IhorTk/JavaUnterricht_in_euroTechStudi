package Day_46_Abstrakcia;

public class Person implements IEat{
    @Override
    public void eat() {
        System.out.println("Person eating");
    }
}
