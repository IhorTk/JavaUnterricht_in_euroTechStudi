package Day_35_Review_Week9;

public class Day_35_klas {
    private String name;
    private  int age;

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
        return "Day_35_klas{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
