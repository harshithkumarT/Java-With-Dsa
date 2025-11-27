package Matrix_Datastructure;

import java.util.Arrays;

public class Printmatrixindiagonalpattern {
    public static int[] matrixDiagonally(int[][] mat) {
//        edge cases
        if(mat.length ==0 || mat[0].length ==0) return new int[0];
        int m  = mat.length;
        int n = mat[0].length;
        int row =0, col =0;
        int i = 0;
        int[] arr = new int[m*n];
        boolean up = true;
        while(row < m && col < n) {
            if(up) {
                while(row > 0 && col < n-1) {
                    arr[i++] = mat[row][col];
                    row --;
                    col ++;
                }
                arr[i++] = mat[row][col];
                if(col == n-1) {
                    row++;
                }else{
                    col++;
                }
            }
            else {
                while(col > 0 && row < m-1) {
                    arr[i++] = mat[row][col];
                    col--;
                    row++;
                }
                arr[i++] = mat[row][col];
                if(row == m-1) {
                    col++;
                }else {
                    row++;
                }
            }
            up = !up;
        }
        return arr;
    }
    public static void main(String[]args) {
        int[][]mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] ans = matrixDiagonally(mat);
        System.out.println(Arrays.toString(ans));
    }
}
