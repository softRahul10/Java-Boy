package DSA.Sorting.InBuilt;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] n = {5,2,1,3,4};
        System.out.println("Arrays Before sorting : ");
        System.out.println(Arrays.toString(n));

        Arrays.sort(n);
        System.out.println("Array After Ascending Sorting : ");
        System.out.println(Arrays.toString(n));

    }
}
