package Day_57_OOP_GeneralRewiev_3;

import java.util.*;

public class StudenMain78 {
    public static void main(String[] args) {


        List<Student78> list = new ArrayList<>();
         Student78 evgeniy = new Student78("Evgeniy", 86.15);
         Student78 oleg = new Student78("Oleg", 79.23);
         Student78 ali = new Student78("Ali", 92.14);
         Student78 anna = new Student78("Anna", 84.79);
         Student78 denis = new Student78("Denis", 93.43);
         Student78 igor = new Student78("Igor", 87.91);

        ClassRoom78 classRoom78 = new ClassRoom78("EuroTechStudi", list);
        classRoom78.addStudent(oleg);
        classRoom78.addStudent(evgeniy);
        classRoom78.addStudent(ali);
        classRoom78.addStudent(denis);
        classRoom78.addStudent(anna);
        classRoom78.addStudent(igor);
        System.out.println("list = " + list);

        System.out.println("=================================================");

        Collections.sort(list, new Comparator<Student78>() {
            @Override
            public int compare(Student78 o1, Student78 o2) {
                return (int) (o1.getGrade()- o2.getGrade());
            }
        });

        System.out.println("list после сортировки= " + list);

        System.out.println("=================================================");

        double sumGrade = 0.0;
        for(Student78 s:list){
            sumGrade+=s.getGrade();
        }
        System.out.println("sumGrade = " + sumGrade);
        System.out.println("=================================================");

        double avgGrade = sumGrade/list.size();
        System.out.println("avgGrade = " + avgGrade);
        System.out.println("=================================================");

        double max = list.get(0).getGrade();
        for (Student78 s:list){
            if (max<s.getGrade())
                max = s.getGrade();
        }
        System.out.println("max = " + max);
        System.out.println("=================================================");

        Student78 max1 = Collections.max(list, new Comparator<Student78>() {
            @Override
            public int compare(Student78 o1, Student78 o2) {
                return (int) (o1.getGrade()-o2.getGrade());
            }
        });
        System.out.println("max1.getGrade() = " + max1.getGrade());
        System.out.println("=================================================");

        double min = list.get(0).getGrade();
        for (Student78 s:list){
            if (min>s.getGrade())
                min = s.getGrade();
        }
        System.out.println("min = " + min);
        System.out.println("=================================================");


        Student78 min1 = Collections.min(list, new Comparator<Student78>() {
            @Override
            public int compare(Student78 o1, Student78 o2) {
                return (int) (o1.getGrade()-o2.getGrade());
            }
        });
        System.out.println("min1.getGrade() = " + min1.getGrade());
        System.out.println("=================================================");

        Student78 student78 = classRoom78.findStudent(denis);
        System.out.println("student78 = " + student78);
        System.out.println("=================================================");

        Student78 student = classRoom78.findByName("Evgeniy");
        System.out.println("student = " + student);


    }
}
