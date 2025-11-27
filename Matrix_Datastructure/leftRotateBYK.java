package Matrix_Datastructure;
import java.util.Arrays;

public class leftRotateBYK {
    public static int[][] rotateMatrix(int k, int[][] mat) {
        int n = mat.length;        // number of rows
        int m = mat[0].length;     // number of columns

        // Result matrix
        int[][] result = new int[n][m];

        // Reduce k (because rotating m times = same as original)
        k = k % m;

        for (int i = 0; i < n; i++) {
            // For each row, rotate left by k
            for (int j = 0; j < m; j++) {
                int newPos = (j + m - k) % m;
                result[i][newPos] = mat[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int k = 1;
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotated = rotateMatrix(k, mat);

        for (int[] row : rotated) {
            System.out.println(Arrays.toString(row));
        }
    }
}
