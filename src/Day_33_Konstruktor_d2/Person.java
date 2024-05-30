package Day_33_Konstruktor_d2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
//        if (!name.equals("ccc"))
//            System.out.println("ne ugadal");
//        throw new IllegalArgumentException(" Nepravilnoe imya obiekta");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
