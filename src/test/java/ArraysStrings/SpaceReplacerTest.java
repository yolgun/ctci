package ArraysStrings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SpaceReplacerTest {
    private final SpaceReplacer sut = new SpaceReplacer();
    private String expected;
    private String given;

    public SpaceReplacerTest(String expected, String given) {
        this.expected = expected;
        this.given = given;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"", ""},
                {"%20", " "},
                {"%20a%20%20", " a  "}
        });
    }

    @Test
    public void shouldReturnCorrect() {
        assertEquals(expected, sut.apply(given));
    }
}