package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        for (int i = 0; i < input.length; i++) {
            input[i] *= input[i];
        }
        Arrays.sort(input);
        Arrays.sort(squaredValues);
        return Arrays.equals(input, squaredValues);
    }
}
