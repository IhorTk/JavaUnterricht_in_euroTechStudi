package Day_49_Polymorphizm;

public class Cat extends Animal65{
    @Override
    public void sound() {
        System.out.println("Miau-miau");
    }


    public void eat(){
        System.out.println("Cat eaten");
    }
}
