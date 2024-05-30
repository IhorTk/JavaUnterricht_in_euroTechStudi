package Day_27_rewiev;

public class DiceMan {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Player oleg = new Player("Олег");
        Player denis = new Player("Денис");


        oleg.playerRoll(dice1);

        denis.playerRoll(dice2);

        if (dice1.getTotal() > dice2.getTotal()){
            System.out.println(oleg.getName() + " выиграл");
        }else if (dice2.getTotal() > dice1.getTotal()){
            System.out.println(denis.getName() + " выиграл");
        }else {
            System.out.println("Ничья");
        }
    }
}
