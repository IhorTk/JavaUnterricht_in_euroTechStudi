package Day_46_Abstrakcia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Bird {

    abstract  void fly();

    abstract int speed();

    public void eat(){
        System.out.println("Bird eating");
    }

    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird ovel = new Ovel();


        List<Bird> list = new ArrayList<>(Arrays.asList(eagle,ovel));
        for (Bird bird: list){
            bird.fly();
            System.out.println(bird.speed());
            bird.eat();
        }
    }
}
