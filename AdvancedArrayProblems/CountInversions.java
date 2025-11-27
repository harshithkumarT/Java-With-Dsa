package AdvancedArrayProblems;

public class CountInversions {
    static int inversionCount(int [] arr) {
        // Code Here
        if(arr.length == 0 ||arr ==null) {
            throw new IllegalArgumentException("array must be contain elements");
        }
        int n = arr.length;
        int inversionCounts = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]){
                    inversionCounts++;
                }
            }
        }
        return inversionCounts;
    }
    public static void main(String[]args){
        int [] arr = {2, 4, 1, 3, 5};
        int ans = inversionCount(arr);
        System.out.println(ans);
    }
}
