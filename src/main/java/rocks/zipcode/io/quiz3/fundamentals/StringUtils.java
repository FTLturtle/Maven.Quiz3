package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0, indexToCapitalize) + Character.toUpperCase(str.charAt(indexToCapitalize)) + str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        String[] allSub = new String[getNumberOfSubStrings(string) + 1];
        int allSubCount = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                allSub[allSubCount] = string.substring(i, j);
                allSubCount++;
            }
        }
        return Arrays.stream(allSub).distinct().toArray(String[]::new);
    }

    public static Integer getNumberOfSubStrings(String input){
        return (int) (input.length() * (input.length() + 1) / 2.0) - 1;
    }
}
