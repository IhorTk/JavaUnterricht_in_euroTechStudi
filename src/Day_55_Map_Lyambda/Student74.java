package Day_55_Map_Lyambda;

import java.util.Objects;

public class Student74 {
    String name;
    double grade;

    public Student74( String name, double grade) {
        this.grade = grade;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student74 student74 = (Student74) o;
        return Double.compare(student74.grade, grade) == 0 && Objects.equals(name, student74.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public String toString() {
        return "Student74{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}
