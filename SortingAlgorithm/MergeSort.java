package SortingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    // Public API: sorts arr between indices l and r (inclusive)
    public static void mergeSort(int[] arr, int l, int r) {
        // call the recursive helper
        mS(arr, l, r);
    }

    // Recursive merge-sort helper
    public static void mS(int[] arr, int l, int r) {
        // BASE CASE: if the segment has 0 or 1 element it's already sorted
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;

        // sort left half
        mS(arr, l, mid);
        // sort right half
        mS(arr, mid + 1, r);
        // merge the two sorted halves
        merge(arr, l, mid, r);
    }

    // Merge sorted subarrays arr[low..mid] and arr[mid+1..high] into arr[low..high]
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        // Merge in ascending order: take smaller element first
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }

        // Append remaining elements from left side (if any)
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }

        // Append remaining elements from right side (if any)
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }

        // Copy merged values back into original array starting at index 'low'
        for (int i = 0; i < list.size(); i++) {
            arr[low + i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // prints: [1, 3, 4, 7, 9]
    }
}
