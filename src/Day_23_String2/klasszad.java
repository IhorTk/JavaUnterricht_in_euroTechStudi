package Day_23_String2;

import java.util.HashSet;
import java.util.Set;

public class klasszad {
    public static void main(String[] args) {
        String word = ("DDEEGDDEEEEFGGDCDD");
        Set uniqueChars = new HashSet();

        for (int i = 0; i < word.length(); i++) {
            if (uniqueChars.add(word.charAt(i))) {
                char letter_unique = word.charAt(i);
                System.out.print(letter_unique);
            }
        }
    }

}
