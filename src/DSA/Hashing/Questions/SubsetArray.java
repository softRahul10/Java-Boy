package DSA.Hashing.Questions;

import java.util.HashSet;

public class SubsetArray {
    public static void main(String[] args) {
        int[] arr1 = {9, 4, 7, 1, 2, 6, 5,10,2,1000,66,9};
        int[] arr2 = {7, 1, -2};
        int[] arr3 = {10, 1};
        boolean res = containsSubset(arr1,arr2);
        System.out.println(res);
    }

    /* subset of array */
    public static boolean containsSubset(int[] arr1, int[] arr2) {
        // Creating Hash Set
        HashSet<Integer> hs = new HashSet<>();
        System.out.println(hs);
        for (int i = 0; i < arr1.length; i++) {
            if(!hs.contains(arr1[i])){
                hs.add(arr1[i]);
            }
        }
        System.out.println(hs);

        for (int i = 0; i < arr2.length; i++) {
            if(!hs.contains(arr2[i])) {
                return false;
            }
        }

        return true;

    }
}
