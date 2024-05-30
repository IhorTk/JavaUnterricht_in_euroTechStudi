package Hausaufgabe;

import java.util.ArrayList;

public class DomMain {
    public static void main(String[] args) {
       Dom dom = new Dom("knkn", 4.5,15.7,10,15.4);
       Dom dom1 = new Dom("kjlkj",  5.4, 12.3,14,17);
       Dom dom2 = new Dom("kljlk", 5.4,2.2,3,5);
       Dom dom3 = new Dom("jkhjk", 5.4,6,8,5.9);
//       Dom dom4 = new Dom();
//       Dom dom5 = new Dom();
//       Dom dom6 = new Dom();

        ArrayList<Dom> dom_m = new ArrayList<>();
        dom_m.add(dom);
        dom_m.add(dom1);
        dom_m.add(dom2);
        dom_m.add(dom3);
//        dom_m.add(dom4);
//        dom_m.add(dom5);
//        dom_m.add(dom6);

        for(Dom bb: dom_m){

            System.out.println("bb+Dom.getCountHaus() = " + bb);

        }
        System.out.println("Dom.getCountHaus() = " + Dom.getCountHaus());

        System.out.println("Dom.countHaus = " + Dom.countHaus);


    }
}
