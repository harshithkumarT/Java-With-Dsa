package TwoSum;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> distinctElements =  new ArrayList<>();//result
        if(arr == null) return distinctElements;
        int i = 0;
        distinctElements.add(arr[i]); // first element always unique
        for(int j= 1;  j < arr.length; j++){
            if(arr[i] != arr[j]) {
                distinctElements.add(arr[j]); //  find new element
                i = j;
            }
        }
        return distinctElements;
    }
    public static void main(String[]args){
        int [] arr = {1,2,4};
        ArrayList<Integer> ans = removeDuplicates(arr);
        System.out.println(ans);
    }
}
