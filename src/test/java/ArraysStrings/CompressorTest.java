package ArraysStrings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CompressorTest {
    private final Compressor sut = new Compressor();
    private String expected;
    private String input;

    public CompressorTest(String expected, String input) {
        this.expected = expected;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"", ""},
                {"a1", "a"},
                {"a2b1c3", "aabccc"},
        });
    }

    @Test
    public void shouldReturnCorrect() {
        assertEquals(expected, sut.apply(input));
    }
}