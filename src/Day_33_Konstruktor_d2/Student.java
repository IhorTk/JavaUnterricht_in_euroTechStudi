package Day_33_Konstruktor_d2;

public class Student {
    public String name;
    public int age;
    public int id;



    public Student() {
    }

    //Конструктр с одним параметром
    public Student(String name) {
        this.name = name;
    }
    // Конструктор с двумя параметрами
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Конструктр с одним параметром
    public Student(int id) {
        this.id = id;
    }
    // Конструктор с двумя параметрами
    public Student(int age, String name){
        this.age = age;
        this.name = name;

    }
    // Конструктор с тремя параметрами
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
