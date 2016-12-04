package ArraysStrings;

import java.util.function.Consumer;

/**
 * CtCI 1.6
 */
public class Rotator implements Consumer<int[][]> {
    @Override
    public void accept(int[][] matrix) {
        int N = matrix.length;
        for(int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - 1 - i; j++) {
                int top = matrix[i][j];
                matrix[i][j] = matrix[N - 1 - j][i]; //left->top
                matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j]; //bottom->left
                matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i]; //right->bottom
                matrix[j][N - 1 - i] = top; //top->right
            }
        }
    }
}
