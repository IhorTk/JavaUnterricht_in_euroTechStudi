package Day_39_StaticMetod2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StaticBlockClass {

    static {
        System.out.println("Статический блок Х");
    }

    static int a = 100;
    static  ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
    static Map<String,String> map;
    int objectVar;

    static {
        System.out.println("Статик блок");
        map = new HashMap<>();
        map.put("Deutschland", "Berlin");
        map.put("Itali", "Roma");
        map.put("Turkai", "Stambul");
        list.add(1);
        list.add(2);
    }


    public static void main(String[] args) {
        System.out.println("Класc Main");
        StaticBlockClass staticBlockClass = new StaticBlockClass(50);
        StaticBlockClass staticBlockClass1 = new StaticBlockClass(150);
        System.out.println("StaticBlockClass.list =" + StaticBlockClass.list);
        System.out.println("StaticBlockClass.map =" + StaticBlockClass.map);

    }
    {
        System.out.println("Не статический блок");
    }
    public StaticBlockClass(int a){
        this.objectVar =a;
        System.out.println("Конструктор");
    }
}
