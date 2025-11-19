package Matrix_Datastructure;

import java.util.Scanner;

public class Matrix {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the matrix");
        int size = sc.nextInt();
        System.out.println(size);
        int [][]arr =new int[size][size];
        System.out.println("enter the data");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

//        print the matrix
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
