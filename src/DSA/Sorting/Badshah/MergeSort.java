package DSA.Sorting.Badshah;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] num = {3,2,4,1};
        System.out.println("Initially : " + Arrays.toString(num));
        mergeSort(num,0,num.length - 1);
        System.out.println(Arrays.toString(num));
    }

    // Merge sort algorithm
    public static void mergeSort(int[] arr, int l, int h) {
        // At least 2 elements are present
        if(h > l) {
            // Step 1: calculate mid
            int mid = l + (h-l)/2;

            // Step 2: Sort Left side of Array
            mergeSort(arr,l,mid);

            // Step 3: Sort Right side of Array
            mergeSort(arr,mid+1,h);

            // Step 4: Merge both sorted Array in One Array
            merge(arr,l,mid,h);
        }
    }

    // Merge function for Merge sort
    private static void merge(int[] arr, int l, int m, int h) {
        int n1 = m - l + 1;
        int n2 = h - m;

        // Left Array
        int[] left = new int[n1];

        // Right Array
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[m+1+i];
        }

        // Simple merge code
        int i = 0;
        int j = 0;
        int k = l;

        while(i < n1 && j < n2) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k] = left[i];
            k++;
            i++;
        }

        while(j < n2) {
            arr[k] = right[j];
            k++;
            j++;
        }

    }
}
