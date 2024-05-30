package Hausaufgabe;

import java.util.Arrays;
import java.util.ArrayList;

public class dvoiniki {
    public static void main(String[] args) {
        int[] stat = {1,2,3,4,5,6,7,8,2,3,2,6,4,5,8};
        System.out.println(Dvoiniki(stat));

    }

    public static String Dvoiniki(int[] stat){
        String vivod = "";
        String word ="";
        for (int i = 0; i < stat.length; i++) {
            word = word + stat[i];
        }
        for (int i = 0; i < word.length(); i++) {
            char char1 = word.charAt(i);
            int index_char1 = word.substring(0, i).indexOf(char1, 0);
            int index_char1n = word.substring(i + 1).indexOf(char1, i);
            if (index_char1 != -1 && index_char1n != -1) {
                vivod = vivod + char1;
            }
        }
        return vivod;
    }

}
