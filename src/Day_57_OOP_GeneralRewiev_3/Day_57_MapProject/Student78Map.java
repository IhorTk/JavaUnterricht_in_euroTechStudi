package Day_57_OOP_GeneralRewiev_3.Day_57_MapProject;

import java.util.Objects;

public class Student78Map {
    private String name;
    private double grade;

    public Student78Map(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student78Map that = (Student78Map) o;
        return Double.compare(grade, that.grade) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public String toString() {
        return "Name = " + name + '\'' +
                ", Grade = " + grade +
                '}';
    }
}
