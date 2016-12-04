package ArraysStrings;

import com.sun.istack.internal.NotNull;

import java.util.BitSet;
import java.util.function.Function;

public class IsUniqueChars implements Function<String, Boolean> {
    @Override
    public Boolean apply(@NotNull String s) {
        BitSet bitSet = new BitSet();
        for (int i = 0; i < s.length(); i++) {
            if (bitSet.get(s.charAt(i)))
                return false;
            bitSet.flip(s.charAt(i));
        }
        return true;
    }
}
