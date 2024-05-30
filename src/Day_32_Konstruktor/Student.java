package Day_32_Konstruktor;

public class Student {
    public String name;

    public double test1, test2, test3;
    public int ID;
    public static int nextUniqueID = 0;

    public Student(String name, double test1, double test2, double test3) {
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    public Student(String name){
        nextUniqueID++;
        this.ID = nextUniqueID;

    }

    public Student(int ID){
        this.ID++;
    }


    public String getName(){
        return name;
    }

    public double getAverage(){
        return (test1+test2+test3)/3;

    }
}
