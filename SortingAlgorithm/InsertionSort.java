package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int [] arr) {
        // code here
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > current) {
                arr[j+1]  =arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    public static void main(String[]args) {
        int [] arr = {4, 1, 3, 9, 7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
