package ArraysStrings;

import java.util.function.Function;

/**
 * CtCI 1.5
 */
public class Compressor implements Function<String, String> {
    @Override
    public String apply(String s) {
        StringBuilder sb = new StringBuilder();
        char lastChar = '\0';
        int lastCharCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == lastChar) {
                lastCharCount += 1;
            } else {
                print(sb, lastChar, lastCharCount);
                lastChar = s.charAt(i);
                lastCharCount = 1;
            }
        }
        print(sb, lastChar, lastCharCount);
        return sb.toString();
    }

    private void print(StringBuilder sb, char lastChar, int lastCharCount) {
        if (lastCharCount != 0) {
            sb.append(lastChar);
            sb.append(lastCharCount);
        }
    }
}
