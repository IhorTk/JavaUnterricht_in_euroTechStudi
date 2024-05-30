package Day_57_OOP_GeneralRewiev_3.Day_57_MapProject;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class ClassRoom78Map implements IStudent78Map{
    private String name;
    private Map<Student78Map, Double> map78;

    @Override
    public void addStudent(Student78Map student78Map, double grade) {
        map78.put(student78Map, grade);
    }

    @Override
    public void removeStudent(Student78Map studen78Map, double grade) {
        map78.remove(studen78Map, grade);
    }

    @Override
    public Student78Map findStudent(Student78Map student78Map, double grade) {
        Set<Student78Map> keySet = map78.keySet();
        for (Student78Map s: keySet){
            if (s==student78Map)
                return s;
        }
        return null;
    }

    @Override
    public Student78Map findByName(String name) {
            Set<Student78Map> student78Maps = map78.keySet();
        for (Student78Map s: student78Maps){
            if (s.getName().equals(name)){
                return s;
            }
        }
        return null;
    }

    public ClassRoom78Map(String name, Map<Student78Map, Double> map78) {
        this.name = name;
        this.map78 = map78;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Student78Map, Double> getMap78() {
        return map78;
    }

    public void setMap78(Map<Student78Map, Double> map78) {
        this.map78 = map78;
    }

    @Override
    public String toString() {
        return "NameGruppe ='" + name + '\'' +
                ", student =" + map78 +
                '}';
    }
}
