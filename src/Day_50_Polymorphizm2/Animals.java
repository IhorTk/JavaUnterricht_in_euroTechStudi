package Day_50_Polymorphizm2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Animals {
    void makeSound(){
        System.out.println("Животный шум");
    }
}
 class Dog extends Animals{
     @Override
     void makeSound() {
         System.out.println("Gav-Gav-Gav");
     }
 }
 class Cat extends Animals{
     @Override
     void makeSound() {
         System.out.println("Miau-Miau-Miau");
     }
 }
 class Duck extends Animals{
     @Override
     void makeSound() {
         System.out.println("Krya-Krya-Krya");
     }

     public void swim(){
         System.out.println(getClass().getSimpleName() + "  swimming");
     }
 }
 class RuntimePolymorphism{
     public static void main(String[] args) {
         Animals a = new Animals();
         Animals s = new Dog();
         Animals k = new Cat();
         Animals u = new Duck();

         Duck duck = new Duck();
         duck.swim();


         ((Duck)u).swim();
         if(u instanceof Duck){
             ((Duck) u).swim();
         }

//         if (s instanceof Dog) {
//             s.makeSound();
//         }
//         if (s instanceof Animals) {
//             s.makeSound();
//         }
//         if (k instanceof Dog){
//             k.makeSound();
//         }else {
//             a.makeSound();
//         }

         List<Animals> list = new ArrayList<>(Arrays.asList(a,s,k,u));

         for (Animals animals: list){
             animals.makeSound();
             if (animals instanceof Duck){
                 ((Duck) animals).swim();
             }
         }

//         for (Animals animals: list){
//             if(animals instanceof Dog){
//                 animals.makeSound();
//             } else if (animals instanceof Cat) {
//                 animals.makeSound();
//
//             }else if (animals instanceof Duck){
//                 animals.makeSound();
//             }else {
//                 animals.makeSound();
//             }
//             System.out.println("animals.getClass().getSimpleName() = " + animals.getClass().getSimpleName());
//             animals.makeSound();
//             System.out.println("animals.getClass().getName() = " + animals.getClass().getName());

//         }

//         System.out.println("s.getClass() = " + s.getClass());
//         System.out.println("s.getClass().getName() = " + s.getClass().getName());
//         System.out.println("s.getClass().getSimpleName() = " + s.getClass().getSimpleName());
//         System.out.println("s.getClass().getComponentType() = " + s.getClass().getComponentType());

     }
 }
