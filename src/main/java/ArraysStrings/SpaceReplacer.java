package ArraysStrings;

import java.util.function.Function;

public class SpaceReplacer implements Function<String, String> {
    @Override
    public String apply(String s) {
        return s.replace(" ", "%20");
    }
}
