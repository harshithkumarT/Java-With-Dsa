package BinarySearchAlgorithm;

public class SortedArraySearch {
    static boolean searchInSorted(int []arr, int k) {
        // Your code here
        if(arr == null || arr.length ==0)  return false;
        int left = 0,right = arr.length-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(arr[mid] == k){
                return true;
            }else if(arr[mid] > k){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }
    public static void main(String[]args) {
        int[] arr = {1, 2, 3, 4, 6};
        int k = 6;
        System.out.println(searchInSorted(arr,k));
    }
}
