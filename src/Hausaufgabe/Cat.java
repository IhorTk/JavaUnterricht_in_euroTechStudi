package Hausaufgabe;

public class Cat {
//    public String name;
    public int age;

    public Cat( int age) {
//        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
//                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
