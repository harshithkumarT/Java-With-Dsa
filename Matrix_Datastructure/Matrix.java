package Matrix_Datastructure;

import java.util.Scanner;

public class Matrix {
    public static void main(String[]args){
        int[][] arr ={
                {1,2,3}
        };
        int row = arr.length;
        int column = arr[0].length;


//        print the matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println(row);

        System.out.println(column);
    }
}
