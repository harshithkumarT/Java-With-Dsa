package AdvancedProblems;

import java.util.HashMap;

public class MejorityELement {
    //brute force approach
    public static int majorityElement(int[] nums) {
//        brute force approach
        int n = nums.length;
        for (int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;
    }
//    public static int majorityElementUsingHashMap(int[] nums) {
//        int n = nums.length;
//        HashMap<Integer, Integer> list = new HashMap<>();
//        for(int item : nums) {
//            if(!list.containsKey(item)) {
//                list.put(item, 1);
//            }else{
//                list.put(item,list.get(item)+1);
//            }
//        }
//        System.out.println(list);
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i)> n/2){
//                return list.get(i);
//            }
//        }
//        return-1;
//    }
    //optimal approach
    public static int majorityElementUsingMoresVootingAlgorithm(int[] nums) {
        int n = nums.length;
        int majority = nums[0];
        int vootes = 1;
        for(int i = 1; i < nums.length; i++){
            if(vootes == 0){
                majority= nums[i];
                vootes = 1;
            }else if(nums[i] != majority){
                vootes--;
            }else{
                vootes++;
            }
        }
        return majority;
    }
    public static void main(String[]args){
        int [] nums = {3,2,3};
        int ans = majorityElement(nums);
        System.out.println(ans);
//        int ans1 = majorityElementUsingHashMap(nums);
//        System.out.println(ans1);
        int ans2 = majorityElementUsingMoresVootingAlgorithm(nums);
        System.out.println(ans2);
    }
}
