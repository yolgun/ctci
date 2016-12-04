package ArraysStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SetRowsAndColumnsToZeroTest {
    private final SetRowsAndColumnsToZero sut = new SetRowsAndColumnsToZero();
    private final int[][] expected = new int[][] {
            {0, 0, 0},
            {0, 4, 5},
            {0, 7, 8},
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