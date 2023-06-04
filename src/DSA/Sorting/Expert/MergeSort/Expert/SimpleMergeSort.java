package DSA.Sorting.Expert.MergeSort.Expert;

import java.util.Arrays;

public class SimpleMergeSort {
    public static void main(String[] args) {
        int[] nums = {10,5,30,15,7};
        System.out.println(" Before -----> " + Arrays.toString(nums));

        mergeInvocation(nums,0, nums.length-1);
        System.out.println(" After -----> " + Arrays.toString(nums));

    }

    /* Merge Sort Algorithm */
    public static void mergeInvocation(int[] arr, int l, int r) {
        //Base Case
        if(r>l) {
            // Find Middle of Array
            int mid = l + (r-l)/2;

            // Sort : First Part ( Left Side )
            mergeInvocation(arr,l,mid);

            // Sort : Second Part ( Right Side )
            mergeInvocation(arr,mid+1,r);

            // Merge
            mergeCallFunction(arr,l,mid,r);
        }
    }

    /* Merge */
    private static void mergeCallFunction(int[] arr, int l, int m, int h) {
        // Step 1 : Decide size of Arrays
        int n1 = m - l + 1;
        int n2 = h - m;

        // Step 2 : Create Arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Step 3 : Fill Data
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[n1+j];
        }

        // Now merge these two sorted Arrays into original array
        // pointers
        int i = 0;
        int j = 0;
        int k = 0;


        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

}
