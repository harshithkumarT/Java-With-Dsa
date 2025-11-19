package AdvancedProblems;

public class KadanesAlgorithm {
    public static int maxSubarraySum(int[] arr) {
        if(arr == null || arr.length ==0){
            throw new IllegalArgumentException("array must be non empty");
        }
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            maxEndingHere  = Math.max(arr[i],maxEndingHere+arr[i]);

            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String[]args){
        int []arr = {2, 3, -8, 7, -1, 2, 3};
        int ans = maxSubarraySum(arr);
        System.out.println(ans);
    }
}
