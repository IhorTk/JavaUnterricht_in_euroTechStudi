package Day_52_Trow_Example;

import java.util.Collection;

public class Notebook {
    String name;
    String model;
    int ram;

    public Notebook(String name, String model, int ram) {
        if( model == null){
            throw new NullPointerException("Model ist null");
        }
        this.name = name;
        this.model = model;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }

    public static void main(String[] args) {
        Notebook notebook = new Notebook("Asus", null,16);
        System.out.println(notebook);
    }

}
