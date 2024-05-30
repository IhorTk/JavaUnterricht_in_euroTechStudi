package Day_30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Day30_klass {
    public static void main(String[] args) {
        //Первый способ
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);//можем добавить дубликаты
        System.out.println(list1);

        //Vторой способ

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("f","j","k","r"));
        list2.add(3,"h");
        System.out.println(list2);

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mersedes");
        cars.add("Mazda");
        System.out.println(cars);
        // Доступ к элементам
        String volvo = cars.get(0);
        System.out.println(volvo);
        String bmw = cars.get(1);
        System.out.println(bmw);
        String ford =cars.get(2);
        System.out.println(ford);

        //изменение элемента

        cars.set(1,"Opel");
        System.out.println(cars);
        System.out.println(cars.get(1));

        //Удаление элемента
        cars.remove(0);
        System.out.println(cars);
        cars.remove("Ford");// Удаляет первый встречный элемент
        System.out.println(cars);
//        cars.removeAll(Arrays.asList("Ford","Ford"));
//        System.out.println(cars);

//        cars.clear();//Удаление всех элементов
        System.out.println(cars);

        System.out.println(cars.size());// размер

        //metodi indexOff(), lastindexOff()

        System.out.println(cars.indexOf("Ford"));
        System.out.println(cars.indexOf("Opel"));

        System.out.println(cars.lastIndexOf("Ford"));
        System.out.println(cars.lastIndexOf("Audi"));

    }
}
