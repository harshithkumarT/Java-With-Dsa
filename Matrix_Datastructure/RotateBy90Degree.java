package Matrix_Datastructure;

import java.util.Arrays;

public class RotateBy90Degree {
    public static void rotateMatrix(int[][] mat) {
        // code here
        int n =mat.length;
        int[][] answer = new int[n][n];
        for (int i = 0; i <= n-1; i++){
            for(int j = n-1; j >= 0; j--){

                answer[n-1-j][i] = mat[i][j];
            }

        }
        //restore the original matrix  because the return type is void
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <n; j++) {

                mat[i][j]  = answer[i][j];

            }

        }
    }
    public static void main(String[]args) {
        int[][] matrix = {
                {0,1,2},
                {3,4,5},
                {6,7,8}
        };
        rotateMatrix(matrix);
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
