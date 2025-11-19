package TwoSum;

import java.util.Arrays;

public class KthElementOfTwoArrays {
    public static int kthElement(int a[], int b[], int k) {
        if (a == null) a = new int[0];
        if (b == null) b = new int[0];
        int total = a.length + b.length;
        if (k <= 0 || k > total) throw new IllegalArgumentException("k out of range");

        int[] combinedArray = new int[total];
        int i = 0, j = 0, pos = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                combinedArray[pos++] = a[i++];
            } else if (b[j] < a[i]) {
                combinedArray[pos++] = b[j++];
            } else { // equal
                combinedArray[pos++] = a[i++];
                combinedArray[pos++] = b[j++];
            }
        }

        while (i < a.length) combinedArray[pos++] = a[i++];
        while (j < b.length) combinedArray[pos++] = b[j++];

        // System.out.println(Arrays.toString(combinedArray)); // remove for production
        return combinedArray[k - 1];
    }

    public static void main(String[]args){
        int [] a= {1, 4, 8, 10, 12};
        int[] b = {5, 7, 11, 15, 17};
        int ans = kthElement(a,b,6);
        System.out.println(ans);
    }
}
