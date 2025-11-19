package TwoSum;

import java.util.Arrays;

public class findInterSection {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        if(a==null || b== null)return 0;
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0; //size
        int i = 0;//first pointer
        int j = 0;//second pointer
        while(i < a.length && j < b.length){

            if(a[i]<b[j]){
                i++;
            }

            else if(b[j] < a[i]){
                j++;
            }
//            if both are some element
            else {
                count ++;
                i++;
                j++;
            }
        }
        return count;

    }
    public static void main(String[]args){
        int [] a= {89, 24, 75, 11, 23};
        int [] b = {89, 2, 4};
        int ans = intersectSize(a,b);
        System.out.println(ans);
    }
}
