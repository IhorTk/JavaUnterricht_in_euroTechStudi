package Day_41_Inheritance1.klas;

public class Plane extends Venicle{
    private int PropellerSize;
    private String engineType;

    public void rotorRpm(){
        System.out.println(getName()+ " обороты двигателя составляют");
    }
    public void pressureCheck(){
        System.out.println(getName() + " выдал чек");
    }
    public void taxi(){
        System.out.println(getName() + " работает в такси");
    }

    public int getPropellerSize() {
        return PropellerSize;
    }

    public void setPropellerSize(int propellerSize) {
        PropellerSize = propellerSize;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "PropellerSize=" + PropellerSize +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    public Plane(String name, double weight, double lenght, int seats, int propellerSize, String engineType) {
        super(name, weight, lenght, seats);
        PropellerSize = propellerSize;
        this.engineType = engineType;
    }
}
