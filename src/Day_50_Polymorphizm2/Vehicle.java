package Day_50_Polymorphizm2;

import Day_49_Polymorphizm.InheritansPoli.Vehicle65;

interface Vehicle50 {
    void start();
    void stop();

}
class Moto implements Vehicle50 {
    @Override
    public void start() {
        System.out.println("Мотоцикл завелся");
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл заглох");

    }
}

class Auto implements Vehicle50{
    @Override
    public void start() {
        System.out.println("Автомобиль завелся");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль заглох");

    }
}

class ExamplePolymorphism {
    public static void main(String[] args) {
        Vehicle50 myMoto = new Moto();
        Vehicle50 myAuto = new Auto();

        startAndStop(myMoto);
        startAndStop(myAuto);
    }
    static void startAndStop(Vehicle50 vehicle50){
        vehicle50.start();
        vehicle50.stop();
    }
}