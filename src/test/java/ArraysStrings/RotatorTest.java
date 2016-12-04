package ArraysStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotatorTest {
    private final Rotator sut = new Rotator();
    private final int[][] expected = new int[][] {
            {6, 3, 0},
            {7, 4, 1},
            {8, 5, 2},
    };
    private final int[][] given = new int[][] {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
    };

    @Test
    public void accept() throws Exception {
        sut.accept(given);
        assertArrayEquals(expected, given);
    }
}