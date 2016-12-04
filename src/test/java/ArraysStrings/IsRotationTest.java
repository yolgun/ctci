package ArraysStrings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IsRotationTest {
    private final IsRotation sut = new IsRotation();
    private boolean expected;
    private String input1;
    private String input2;

    public IsRotationTest(boolean expected, String input1, String input2) {
        this.expected = expected;
        this.input1 = input1;
        this.input2 = input2;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true, "", ""},
                {true, "a", "a"},
                {true, "qwerty", "rtyqwe"},
                {false, "qwerty", "qweryt"}
        });
    }

    @Test
    public void apply() throws Exception {
        assertEquals(expected, sut.apply(input1, input2));
    }

}