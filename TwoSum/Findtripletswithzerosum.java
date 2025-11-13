package TwoSum;
import java.util.Arrays;

public class Findtripletswithzerosum {


//    brute force approach
//    public static boolean findTriplets(int[] arr) {
//        int n = arr.length;
//        if(n < 2) return false;
//        //first pointer
//        for(int i = 0; i < n-2; i++){
//            for(int j = i+1; j < n-1; j++){
//                for(int k = j+1; k < n; k++){
//                    if(arr[i] + arr[j]+ arr[k] == 0){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
    public static void main(String[]args){
        int[] arr = {-5, 3, 2, -1, 0, 1};
        System.out.println(findTriplets(arr));

    }
    public static boolean findTriplets(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0;  i < arr.length-2; i++){
            int right = arr.length-1;
            int left = i+1;
            while(left <= right){
                int sum = arr[i] + arr[left]+ arr[right];
                if(sum == 0) return true;
                else if(sum > 0)  right--;
                else left++;
            }
        }
        return false;
    }
}
