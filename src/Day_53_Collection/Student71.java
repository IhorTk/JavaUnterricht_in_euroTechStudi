package Day_53_Collection;

public class Student71 {
    private  String name;
    private int age;

    public Student71(String name, int age) {
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
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



    @Override
    public String toString() {
        return "Student71{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
