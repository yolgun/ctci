package ArraysStrings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IsUniqueCharsTest {
    private final IsUniqueChars sut = new IsUniqueChars();
    private boolean expected;
    private String input;

    public IsUniqueCharsTest(boolean expected, String input) {
        this.expected = expected;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true, ""},
                {true, "a"},
                {true, "qwerty"},
                {false, "aa"}
        });
    }

    @Test
    public void shouldReturnCorrect() {
        assertEquals(expected, sut.apply(input));
    }
}