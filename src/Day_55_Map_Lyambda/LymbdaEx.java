package Day_55_Map_Lyambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LymbdaEx {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Animal dog = new Animal(){
            @Override
            void eat() {
                System.out.println("Dog eating");
            }

            @Override
            void walk() {
                System.out.println("Dog walk");
            }
        };
        dog.eat();
        dog.walk();

        Swimmable fish = new Swimmable() {
            @Override
            public void swim() {
                System.out.println("Fish swimmen");
            }
        };
        fish.swim();

        Swimmable fish1 = ()-> System.out.println("Fish swimming schnell");
        fish1.swim();

        Student74 oleg = new Student74("Oleg", 75.50);
        Student74 denis = new Student74("Denis", 71.50);
        Student74 igor = new Student74("Igor", 85.00);
        Student74 evgeniy = new Student74("Evgeniy", 70.50);
        Student74 ali = new Student74("Ali", 72.50);
        List<Student74> list = new ArrayList<>(Arrays.asList(oleg,denis,igor,evgeniy,ali));
        System.out.println("list = " + list);

        Collections.sort(list,((o1, o2) -> o1.name.compareTo(o2.name)));
        System.out.println("list = " + list);


        Comparable<Integer> objectComparable = o -> 0;



//        Dog dog = new Dog();
//        dog.eat();
//
    }
}

class Animal{
    void eat(){
        System.out.println("Animal eating");
    }

    void walk(){
        System.out.println("Animal walk");
    }
}

//class Dog extends Animal{
//    @Override
//    void eat() {
//        System.out.println("Dog eating");
//    }
//}

interface Swimmable{
    void swim();
}

//class Fish implements Swimmable{
//    @Override
//    public void swim() {
//        System.out.println("Fish swim");
//    }
//}
