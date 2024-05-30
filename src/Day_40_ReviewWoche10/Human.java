package Day_40_ReviewWoche10;

import java.util.ArrayList;

public class Human {
    //pol
    private String gender ="W";
    //vozrast
    public int age;
    // est li bolezni
    public boolean isIll;
    //spisok boleznei(kogta)
    public ArrayList <Integer> listOfSick = new ArrayList<>();

    public Human(String gender, int age, boolean isIll) {
        this.gender = gender;
        this.age = age;
        this.isIll = isIll;
    }

    public Human(int age) {
        this.age = age;
    }

    public void setHuman (String gender){
        if ((("W".equalsIgnoreCase(gender))||("M".equalsIgnoreCase(gender))));{
            this.gender = gender;
        }
    }


}
