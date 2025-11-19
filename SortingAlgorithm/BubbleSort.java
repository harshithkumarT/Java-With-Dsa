package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        // code here
        int n = arr.length; //length of the array
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int temp  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
//                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
    public static void main(String[]args) {
        int [] arr = {4, 1, 3, 9, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
