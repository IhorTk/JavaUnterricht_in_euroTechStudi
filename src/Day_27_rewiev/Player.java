package Day_27_rewiev;

public class Player {
    public String name;

    public Player(String name) {
        this.name = name;
    }

    public void playerRoll(Dice dice){
        System.out.println("Игрок " + name + " бросает кости");
        dice.roll();
        System.out.println("У игрока " + name + " очки " + dice.getDie1() + " + " + dice.getDie2() + " = " + dice.getTotal() );
    }

    public String getName(){
        return name;
    }
}
