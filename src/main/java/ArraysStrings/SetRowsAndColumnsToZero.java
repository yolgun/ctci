package ArraysStrings;

import java.util.BitSet;
import java.util.function.Consumer;

/**
 * CtCI 1.7
 */
public class SetRowsAndColumnsToZero implements Consumer<int[][]> {
    private BitSet rows;
    private BitSet columns;
    private int[][] matrix;

    @Override
    public void accept(int[][] matrix) {
        this.matrix = matrix;
        rows = new BitSet(matrix.length);
        columns = new BitSet(matrix[0].length);
        find();
        set();
    }

    private void find() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.set(i);
                    columns.set(j);
                }
            }
        }
    }
    private void set() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rows.get(i) || columns.get(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

