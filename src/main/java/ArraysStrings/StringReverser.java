package ArraysStrings;

import java.util.function.Function;

public class StringReverser implements Function<String, String>{

    @Override
    public String apply(String s) {
        char[] reversed = s.toCharArray();
        for (int beg = 0, end = s.length() - 1; beg < end; beg++, end--) {
            swap(reversed, beg, end);
        }
        return String.valueOf(reversed);
    }

    private void swap(char[] reversed, int beg, int end) {
        char tmp = reversed[beg];
        reversed[beg] = reversed[end];
        reversed[end] = tmp;
    }
}
