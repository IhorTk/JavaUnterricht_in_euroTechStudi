package Day_35_Review_Week9;
import java.util.ArrayList;

public class ClassRoom {
    private String className;
    private String classTeacher;

    ArrayList<Student48> arrayList = new ArrayList<>();

    public ClassRoom(String className, String classTeacher) {
        this.className = className;
        this.classTeacher = classTeacher;

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {

        this.className = className;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public ArrayList<Student48> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Student48> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "className='" + className + '\'' +
                ", classTeacher='" + classTeacher + '\'' +
                ", arrayList=" + arrayList +
                '}';
    }
}