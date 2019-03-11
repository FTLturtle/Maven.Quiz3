package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        char ch;
        ArrayList<String> result = new ArrayList<>();
        boolean replaced;

        for (int i = 0; i < str.length(); i++) {
            replaced = false;
            while (!replaced && i < str.length()) {
                ch = sb.charAt(i);
                if (Character.isAlphabetic(ch)) {
                    sb.setCharAt(i, Character.toUpperCase(ch));
                    result.add(sb.toString());
                    sb.setCharAt(i, ch);
                    replaced = true;
                } else {
                    i++;
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
