package Day_41_Inheritance1.personPacet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonsMain {
    public static void main(String[] args) {
        Person programmer = new Programmer("Гоша", "Програмист", "Google");
        System.out.println("programmer.getName() = " + programmer.getName());

        System.out.println("programmer.getDesignation() = " + programmer.getDesignation());

        System.out.println("programmer.getCompanyName() = " + ((Programmer) programmer).getCompanyName());

        Dancer dancer = new Dancer("Shakira","Dancer", "ABBA");

//        System.out.println("dancer.getName() = " + dancer.getName());
        Singer singer = new Singer("Shakira","Singer","Sam");

        List <Person> list = new ArrayList<>(Arrays.asList(programmer,dancer,singer));

        for (Person person: list){
            if (person instanceof Programmer){
                System.out.println(((Programmer) person).getCompanyName());
            }
        }

        for (Person person: list){
            System.out.println(person);
        }


    }
}
