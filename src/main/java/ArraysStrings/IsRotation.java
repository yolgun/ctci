package ArraysStrings;

import java.util.function.BiFunction;

/**
 * CtCI 1.8
 */
public class IsRotation implements BiFunction<String, String, Boolean> {
    @Override
    public Boolean apply(String s, String s2) {
        return (s + s).contains(s2);
    }
}
