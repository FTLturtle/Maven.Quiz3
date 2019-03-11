package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String lowerCaseWord = word.toLowerCase();
        return lowerCaseWord.contains("a") ||
                lowerCaseWord.contains("e") ||
                lowerCaseWord.contains("i") ||
                lowerCaseWord.contains("o") ||
                lowerCaseWord.contains("u");
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char c;
        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            if (isVowel(c)) {
                return i;
            }
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        character = Character.toLowerCase(character);
        return character == 'a' ||
                character == 'e' ||
                character == 'i' ||
                character == 'o' ||
                character == 'u';
    }
}
