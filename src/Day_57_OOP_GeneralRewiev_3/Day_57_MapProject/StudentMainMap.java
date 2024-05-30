package Day_57_OOP_GeneralRewiev_3.Day_57_MapProject;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.*;

import java.util.TreeMap;

public class StudentMainMap {
    public static void main(String[] args) {

        Map<Student78Map, Double> map78 = new TreeMap<>(new Comparator<Student78Map>() {
            @Override
            public int compare(Student78Map o1, Student78Map o2) {
                return (int) (o1.getGrade()- o2.getGrade());
            }
        });

        Student78Map oleg = new Student78Map("Oleg", 89.23);
        Student78Map igor = new Student78Map("Igor", 93.87);
        Student78Map vasiliy = new Student78Map("Vasiliy", 92.56);
        Student78Map evgeniy = new Student78Map("Evgeniy", 87.26);
        Student78Map denis = new Student78Map("Denis", 76.52);
        Student78Map ali = new Student78Map("Ali", 75.19);
        Student78Map anna = new Student78Map("Anna", 82.78);
        Student78Map sergey = new Student78Map("Sergey", 56.74);
        Student78Map grigoriy = new Student78Map("Grigoriy", 69.28);
//        Student78Map filip = new Student78Map("Filip", 93.62);

        ClassRoom78Map classRoom78Map = new ClassRoom78Map("SDET14", map78);
        classRoom78Map.addStudent(oleg, oleg.getGrade());
        classRoom78Map.addStudent(igor, igor.getGrade());
        classRoom78Map.addStudent(vasiliy, vasiliy.getGrade());
        classRoom78Map.addStudent(evgeniy, evgeniy.getGrade());
        classRoom78Map.addStudent(denis, denis.getGrade());
        classRoom78Map.addStudent(ali, ali.getGrade());
        classRoom78Map.addStudent(anna, anna.getGrade());
        classRoom78Map.addStudent(sergey, sergey.getGrade());
        classRoom78Map.addStudent(grigoriy, grigoriy.getGrade());
//        classRoom78Map.addStudent(filip, filip.getGrade());

        System.out.println("classRoom78Map = " + classRoom78Map);
        System.out.println("====================================================");


//        classRoom78Map.removeStudent(grigoriy, grigoriy.getGrade());
//        System.out.println("classRoom78Map remove= " + classRoom78Map);
        System.out.println("=======================================================");

        System.out.println("classRoom78Map.findStudent(oleg, oleg.getGrade()) = " + classRoom78Map.findStudent(oleg, oleg.getGrade()));

        System.out.println("==========================================================");

        Collection<Double> values = map78.values();
        Double min = Collections.min(values, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int) (o1-o2);
            }
        });

        System.out.println("minGrade = " + min);

        System.out.println("====================================");

        Double max = Collections.max(values, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int) (o1-o2);
            }
        });
        System.out.println("maxGrade = " + max);
        System.out.println("====================================");

        double sumOffGrade = 0.0;
        for(Double d: values){
            sumOffGrade+=d;
        }
        System.out.println("sumOffGrade = " + sumOffGrade);
        System.out.println("====================================");

        double srOffGrade = sumOffGrade/map78.size();
        System.out.printf("srOffGrade = %.2f", srOffGrade);
        System.out.println();
        System.out.println("====================================");

        Student78Map studentMap = classRoom78Map.findByName("Igor");


    }
}
