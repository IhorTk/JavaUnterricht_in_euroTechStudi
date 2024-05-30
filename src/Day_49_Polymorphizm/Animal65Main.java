package Day_49_Polymorphizm;

import java.util.ArrayList;
import java.util.List;

public class Animal65Main {
    public static void main(String[] args) {
        ISound animal65 = new Animal65();
        ISound cat = new Cat();
        ISound dog = new Dog();
        ISound hen = new Hen();

        List<ISound> list = new ArrayList<>();
        list.add(animal65);
        list.add(cat);
        list.add(dog);
        list.add(hen);

        for (ISound animal : list){
            animal.sound();
        }

        System.out.println("=====================================================");

        cat.sound();
        dog.sound();
        hen.sound();
    }
}
