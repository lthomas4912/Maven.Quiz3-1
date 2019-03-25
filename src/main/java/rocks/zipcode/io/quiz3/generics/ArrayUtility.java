package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType type : array){
            if (getNumberOfOccurrences(type) % 2 == 1){
                return type;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType type : array){
            if(getNumberOfOccurrences(type) % 2 == 0){
                return type;
            }
        }
         return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count = 0;
        for(SomeType type : array){
            if(type == valueToEvaluate){
                count++;
            }
        }

        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return Arrays.stream(array)
                .filter(element -> predicate.apply(element))
                .toArray(size -> Arrays.copyOf(array, size));
    }
}
