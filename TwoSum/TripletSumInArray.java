package TwoSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TripletSumInArray {
//    brute force approach
//    public static boolean hasTripletSum(int arr[], int target) {
//        // code Here
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i+1; j < arr.length; j++){
//                for(int k = 0; k < arr.length; k++){
//                    if(arr[i] + arr[j] + arr[k] == target){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }

//            optimal approach
    public static boolean hasTripletSum(int arr[], int target) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-2; i++){
            int right = arr.length-1;
            int left = i+1;
            while(left < right){
                int sum = arr[i] + arr[left]+arr[right];
                if( sum==target){
                    return true;
                }else if(sum >target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;
        System.out.println(hasTripletSum(arr, target));
    }
}
