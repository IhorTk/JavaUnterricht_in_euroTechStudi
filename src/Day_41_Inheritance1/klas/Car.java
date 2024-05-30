package Day_41_Inheritance1.klas;

public class Car extends Venicle{
    private int tieresSize;
    private  String brand;
    private int doorNumber;

    public void honk(){
        System.out.println(getName() + " сигналит");
    }
    public void handBreak(){
        System.out.println(getName() + "   на стояночном тормозе");
    }

    public void openTrunk() {
        System.out.println(getName()+ "  открыл багажник");
    }

    public int getTieresSize() {
        return tieresSize;
    }

    public void setTieresSize(int tieresSize) {
        this.tieresSize = tieresSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public Car(String name, double weight, double lenght, int seats, int tieresSize, String brand, int doorNumber) {
        super(name, weight, lenght, seats);
        this.tieresSize = tieresSize;
        this.brand = brand;
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tieresSize=" + tieresSize +
                ", brand='" + brand + '\'' +
                ", doorNumber=" + doorNumber +
                '}';
    }
}
