package TwoSum;
import java.util.*;

public class UnionOfArraysWithDuplicates {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {

        ArrayList<Integer> ansList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < a.length && j < b.length){
            if(!ansList.contains(a[i])){
                ansList.add(a[i]);
            }
            if(!ansList.contains(b[j])){
                ansList.add(b[j]);
            }
            i++;
            j++;
        }

        while(i < a.length){
            if(!ansList.contains(a[i])){
                ansList.add(a[i]);
            }
            i++;
        }

        while(j < b.length){
            if(!ansList.contains(b[j])){
                ansList.add(b[j]);
            }
            j++;
        }

        Collections.sort(ansList);
        return ansList;
    }
    public static void main(String[]args){
        int [] a= {1, 2, 1, 1, 2};
        int [] b = {2, 2, 1, 2, 1};
//        ArrayList<Integer> ansList = findUnion(a,b);
//        System.out.println(ansList);

//        using tree set
//        ArrayList<Integer> ansList2 = findUnionUsingTreeSet(a,b);
//        System.out.println(ansList2);

//        using two pointer
        ArrayList<Integer> ansList3 = findUnionUsingTwoPointer(a,b);
        System.out.println(ansList3);
    }

//     using tree set to find the union of two array
//    it is a optimal approach it taking only O(n log n ) time

    public static ArrayList<Integer> findUnionUsingTreeSet(int[] a, int[] b) {
        Set<Integer> unionSet = new TreeSet<>();

        for(int x:a) unionSet.add(x);
        for(int y : b) unionSet.add(y);


        return new ArrayList<>(unionSet);
    }

//    using two pointer
public static ArrayList<Integer> findUnionUsingTwoPointer(int[] a, int[] b) {
    ArrayList<Integer> result = new ArrayList<>();
    int i = 0, j = 0;

    // Precondition: a and b should be sorted. If not, sort them first.
    while (i < a.length && j < b.length) {
        if (a[i] < b[j]) {
            // add a[i] if it's not duplicate of last element in result
            if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            // always advance i (even if we didn't add because it was duplicate)
            i++;
        }
        else if (b[j] < a[i]) {
            if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                result.add(b[j]);
            }
            // always advance j
            j++;
        }
        else { // a[i] == b[j]
            if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            // advance both pointers whether or not we added (to skip duplicates)
            i++;
            j++;
        }
    }

    // Remaining elements in a
    while (i < a.length) {
        if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
            result.add(a[i]);
        }
        i++;
    }

    // Remaining elements in b — NOTE: use b[j], not a[j]
    while (j < b.length) {
        if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
            result.add(b[j]);
        }
        j++;
    }

    return result;
}

}
