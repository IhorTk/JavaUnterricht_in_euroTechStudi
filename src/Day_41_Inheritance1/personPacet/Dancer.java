package Day_41_Inheritance1.personPacet;

public class Dancer extends Person  {

    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dance(){
        System.out.println(getName() + "танцует ");
    }
}
