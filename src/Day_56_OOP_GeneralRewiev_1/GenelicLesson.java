package Day_56_OOP_GeneralRewiev_1;

import Day_55_Map_Lyambda.Student74;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GenelicLesson {
    public static void main(String[] args) {

        String one = "one";

        List list = new ArrayList<>();
        list.add("one");
        list.add(1);
        list.add(20.00);
        list.add(new Student74("Igor",75.00));

        Object o = list.get(0);
        System.out.println("o = " + o);

        System.out.println("======================================");
        for (Object obj: list){
            System.out.println("list.get(0) = " + list.get(1));
        }

        System.out.println("========================================");

        System.out.println("list = " + list);
        System.out.println("=============================================");

        GenericClass<Integer> genericClass = new GenericClass<>(10);
        System.out.println("genericClass = " + genericClass);
        GenericClass<String> genericClass1 = new GenericClass<>("jzt");
        System.out.println("genericClass1 = " + genericClass1);
        System.out.println("==========================================");

        Integer[] integers = {1,2,3,4,5,6};
        printArray(integers);
        String[] strings = {"one","two","three","four"};
        printArray(strings);
    }

    static <T> List<T> printArray(T[] arr){
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        return new ArrayList<>();
    }
}

class GenericClass<T>{

    T value1;

    public GenericClass(T value1) {
        this.value1 = value1;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "value1=" + value1 +
                '}';
    }
}
