package ArraysStrings;

import java.util.Arrays;
import java.util.function.BiFunction;

/**
 * CtCI 1.2
 */
public class PermutationOf implements BiFunction<String, String, Boolean>{
    @Override
    public Boolean apply(String s, String s2) {
        char[] SChars = s.toCharArray();
        Arrays.sort(SChars);
        char[] S2Chars = s2.toCharArray();
        Arrays.sort(S2Chars);
        return Arrays.equals(SChars, S2Chars);
    }
}
