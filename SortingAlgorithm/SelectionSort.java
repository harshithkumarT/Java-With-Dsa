package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void  selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int select = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[]args)  {
        int[] arr = {4, 1, 3, 9, 7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
