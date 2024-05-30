package Day_41_Inheritance1.personPacet;

public class Singer extends Person  {

    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing(){
        System.out.println(getName() + " поет ");
    }

    public void playGuitar(){
        System.out.println(getName() + " играет гитару");
    }
}
