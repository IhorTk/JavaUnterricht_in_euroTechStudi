package Day_41_Inheritance1.klas;

public class Venicle {
    private String name;
    private double weight;
    private double lenght;
    private int seats;

    public Venicle(String name, double weight, double lenght, int seats) {
        this.name = name;
        this.weight = weight;
        this.lenght = lenght;
        this.seats = seats;
    }

    public void start() {
        System.out.println(name + "    завелся");
    }

    public void stop() {
        System.out.println(name + "   остановился");
    }

    public void move() {
        System.out.println(name + "  двигается");
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Venicle{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", lenght=" + lenght +
                ", seats=" + seats +
                '}';
    }
}
