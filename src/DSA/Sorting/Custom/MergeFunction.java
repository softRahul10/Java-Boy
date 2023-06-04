package DSA.Sorting.Custom;

import java.util.Arrays;

public class MergeFunction {
    public static void main(String[] args) {
        int[] arr1 = {10,15,20};
        int[] arr2 = {6,6,15};
        int[] res = merge(arr1,arr2);

        System.out.println(Arrays.toString(res));

        int[] res2 = merge3(new int[]{10,15,20,40,8,11,55},0,3,6);
        System.out.println(Arrays.toString(res2));

    }

    /* Naive Solution */
    public static void mergeFn(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];

        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];
        }

        for (int i = 0; i < second.length; i++) {
            result[first.length+i] = second[i];
        }

        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

    }

    /* Merge function for merge sort */
    public static int[] merge3(int[] arr, int l, int m, int h) {
        int[] left = new int[m+1];
        int[] right = new int[h-m];
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[left.length+i];
        }
        return merge(left,right);
    }

    /* Optimized solution */
    public static int[] merge(int[] first, int[] second) {
        // Step:1 - Create new Array
        int[] mix = new int[first.length + second.length];

        // Step:2 - Create Three pointers
        int i = 0;
        int j = 0;
        int k = 0;

        // Step:3 - Fill New Array
        while(i < first.length && j < second.length) {
            if(first[i] <= second[j]) {
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Step:4 - Fill remaining elements
        while(i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
