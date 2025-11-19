package SortingAlgorithm;

/*
 * QuickSort implementation using Hoare's partition scheme.
 *
 * Key points (also explained inline in comments):
 * - This class exposes a public quickSort(int[] arr, int low, int high) method
 *   which you can call to sort arr between indices low and high (inclusive).
 * - The algorithm uses recursion and in-place swaps (no extra arrays).
 * - Partition uses Hoare's partition scheme (fast and does fewer swaps than Lomuto).
 * - For Hoare partition: choose a pivot, move two indices inward (i and j),
 *   swapping out-of-place elements until the indices cross; return the crossing index.
 *
 * Complexity:
 * - Average time: O(n log n)
 * - Worst-case time: O(n^2) (can happen for already-sorted input with bad pivot choice)
 * - Space: O(log n) on average due to recursion (O(n) worst-case recursion depth)
 */

public class QuickSort {

    /**
     * Public API to sort the array between indices low and high (inclusive).
     * Example call to sort whole array: quickSort(arr, 0, arr.length - 1)
     */
    public static void quickSort(int[] arr, int low, int high) {
        // Defensive checks
        if (arr == null || arr.length == 0) return;
        if (low < 0) low = 0;
        if (high >= arr.length) high = arr.length - 1;

        // Kick off recursive quicksort
        qs(arr, low, high);
    }

    /**
     * The recursive quicksort method.
     * For Hoare partition, partition(...) returns an index p such that:
     *   - all elements in arr[low..p] <= some pivot-related partition
     *   - all elements in arr[p+1..high] >= that pivot-related partition
     *
     * After partitioning, we recursively sort the two subranges.
     */
    private static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high); // Hoare partition returns a split index
            // For Hoare partition, use (low..p) and (p+1..high)
            qs(arr, low, p);
            qs(arr, p + 1, high);
        }
    }

    /**
     * Hoare partition scheme:
     * - Choose pivot (here we choose the middle element for better average behavior
     *   than always picking the first element).
     * - Set i = low - 1, j = high + 1
     * - Repeatedly increment i until arr[i] >= pivot, decrement j until arr[j] <= pivot,
     *   then if i < j swap arr[i] and arr[j], otherwise return j (the partition index).
     *
     * Notes:
     * - This partitioning works with duplicates well.
     * - The returned index is NOT necessarily the final position of the pivot element;
     *   it's a crossing index used to split the array for recursion.
     */
    private static int partition(int[] arr, int low, int high) {
        // Choose pivot - using middle element reduces chance of worst-case for already sorted input
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];

        int i = low - 1;
        int j = high + 1;

        while (true) {
            // Move i to the right until an element >= pivot is found
            do {
                i++;
            } while (arr[i] < pivot);

            // Move j to the left until an element <= pivot is found
            do {
                j--;
            } while (arr[j] > pivot);

            // If pointers crossed, partitioning is done — return j as the split point
            if (i >= j) {
                return j;
            }

            // Otherwise swap the out-of-place elements and continue
            swap(arr, i, j);
        }
    }

    /**
     * Simple utility to swap two elements in the array.
     * Keeps code clean and avoids repeated code in partition.
     */
    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    // Optional: small main for quick manual testing (you can remove or keep)
    public static void main(String[] args) {
        int[] arr = { 24, 97, 40, 67, 88, 85, 15, 72, 49, 66 };
        quickSort(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        // Expected sorted output: 15 24 40 49 66 67 72 85 88 97
    }
}
