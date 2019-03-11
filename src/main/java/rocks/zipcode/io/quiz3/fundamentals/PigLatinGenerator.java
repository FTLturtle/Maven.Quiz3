package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String string : strArr) {
            sb.append(translateWord(string)).append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public String translateWord(String str) {
        String result;
        if (VowelUtils.startsWithVowel(str)) {
            result = str + "way";
        } else if (!VowelUtils.hasVowels(str)) {
            result = str + "ay";
        } else {
            Integer firstVowel = VowelUtils.getIndexOfFirstVowel(str);
            result = str.substring(firstVowel) + str.substring(0, firstVowel) + "ay";
        }
        return result;
    }
}
