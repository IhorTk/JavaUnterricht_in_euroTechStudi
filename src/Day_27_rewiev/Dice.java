package Day_27_rewiev;

import java.util.Random;

public class Dice {
    public int die1;
    public int die2;

    public Dice() {

    }

    public void roll(){
        Random random = new Random();
        die1 = random.nextInt(6-1) + 1;
        die2 = random.nextInt(6-1) + 1;
    }

    public int getDie1(){
        return die1;
    }

    public int getDie2(){
        return die2;
    }

    public int getTotal(){
        return die1 + die2;
    }
}
