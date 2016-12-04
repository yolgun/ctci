package ArraysStrings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringReverserTest {
    private final StringReverser sut = new StringReverser();
    private String expected;
    private String input;

    public StringReverserTest(String expected, String input) {
        this.expected = expected;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"", ""},
                {"a", "a"},
                {"qwerty", "ytrewq"}
        });
    }

    @Test
    public void shouldReturnCorrect() throws Exception {
        assertEquals(expected, sut.apply(input));
    }

}