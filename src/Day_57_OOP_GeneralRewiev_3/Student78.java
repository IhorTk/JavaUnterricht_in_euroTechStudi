package Day_57_OOP_GeneralRewiev_3;

public class Student78 {
    private String name;
    private Double grade;

    public Student78(String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Имя='" + name + '\'' +
                ", Оценка=" + grade +
                '}';
    }
}
