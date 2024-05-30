package day_18_Class_i_obekti;

public class Car {

    public String carName;
    public String model;
    public int year;
    public String color;
    public int engine;

    public void start(){
        System.out.println(carName + "  начала запускаться");
    }
    public void dreive(){

        System.out.println(carName + "  начала двигаться");
    }
    public void displayCar(){
        System.out.println("Название" + carName + ",  Модель" + model + ",   год выпуска " + year + ", цвет машины  " +
                color + ",  Объем двигателя" + engine);
    }
}
