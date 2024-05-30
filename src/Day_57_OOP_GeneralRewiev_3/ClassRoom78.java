package Day_57_OOP_GeneralRewiev_3;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom78 implements IStudent78{
    private String name;
    private List<Student78> list;

    public ClassRoom78(String name, List<Student78> list) {
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student78> getList() {
        return list;
    }

    public void setList(List<Student78> list) {
        this.list = list;
    }

    private int findIndex(String name){
        for (int i = 0; i < list.size(); i++) {
            if (name == list.get(i).getName()){
                return i;
            }
        }
        return -1;
    }

    public Student78 findByName(String name){
        Student78 student78 = list.get(findIndex(name));
        return student78;
    }

    @Override
    public String toString() {
        return "ClassRoom78{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    @Override
    public void addStudent(Student78 student78) {
        list.add(student78);
    }

    @Override
    public void removeStudent(Student78 student78) {
        list.remove(student78);

    }

    @Override
    public Student78 findStudent(Student78 student78) {
        for(Student78 s: list){
            if (student78==s){
                return s;
            }
        }
        return null;
    }



    //    public void addStudent(Student78 student78){
//        list.add(student78);
//    }
//
//    public void removeStudent(Student78 student78){
//        list.remove(student78);
//
//    }
//    public Student78 findStudent(Student78 student78){
//        for(Student78 s: list){
//            if (student78==s){
//                return s;
//            }
//        }
//        return null;
//    }
}
