package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        int occurrences;
        for (SomeType obj : array) {
            occurrences = getNumberOfOccurrences(obj);
            if (occurrences % 2 != 0) {
                return obj;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        int occurrences;
        for (SomeType obj : array) {
            occurrences = getNumberOfOccurrences(obj);
            if (occurrences % 2 == 0) {
                return obj;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return (int) Arrays.stream(array).filter(x -> x.equals(valueToEvaluate)).count();
    }

    @SuppressWarnings("unchecked")
    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return Arrays.stream(array).filter(predicate::apply).toArray(size -> (SomeType[]) Array.newInstance(array.getClass().getComponentType(), size));
    }
}
