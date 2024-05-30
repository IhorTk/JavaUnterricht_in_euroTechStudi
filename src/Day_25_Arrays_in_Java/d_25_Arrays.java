package Day_25_Arrays_in_Java;

public class d_25_Arrays {
    public static void main(String[] args) {
        //первый способ
        int[] myArray;
        double[] dArray;
        byte[] bArray;
        boolean[] bolArray;
        //второй способ
        int myArray1[];

//        House[] hauses;
//        House houses1 =new House();
//        House houses2 =new House();
//        House houses3 =new House();
//        House houses4 =new House();
//        House houses5 =new House();
////        House[] houses = {houses1,houses2, houses3, houses4, houses5};
//
////        hauses[0] = houses1;
////        hauses[1] = houses2;
////        hauses[2] = houses3;
////        hauses[3] = houses4;
////        hauses[4] = houses5;



        //Создание массива
        // первый способ
        myArray = new int[10];
        myArray[0] = 1;
        dArray = new double[5];


        //второй способ
        int[] intArray = {1,2,3,4,5};
        intArray[0] = 10;
        int length = intArray.length;
        System.out.println(" Длина массива   " + length);
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
//        System.out.println(intArray[5]);

        String [] cars = {"Volvo", "BMW", "Ford", "Mersedes"};
                int dlinamassiva = cars.length;
        System.out.println(dlinamassiva);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("forEach");
        for (String car : cars){
            System.out.println(car);
        }
    }
    static int sumOfElemensOfArray(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
        return sum;
    }

    static int[] reverseInArray(int[] array){
        int[] result =new int[array.length];
        for (int i= 0, j = result.length -1; i<array.length; i++, j--){
            result[j] = array[i];
        }
        return result;
    }
}
