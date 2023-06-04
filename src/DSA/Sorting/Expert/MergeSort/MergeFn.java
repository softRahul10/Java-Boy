package DSA.Sorting.Expert.MergeSort;

import java.util.Arrays;

public class MergeFn {
    public static void main(String[] args) {

        int[] array = {10,20,40,20,30};

        int l = 0;
        int h = array.length - 1;
        int m = (l+h) / 2;

        System.out.println("Original Array " + Arrays.toString(array));

        mergeMethod(array,l,m,h);

        System.out.println("Merge Array " + Arrays.toString(array));

    }


    /* Sandeep Sir's Solution */
    public static void mergeMethod(int[] arr, int l, int m, int h) {

        int n1 = m - l + 1;
        int n2 = h - m;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[n1+j];
        }

        modifiedMergeFn(left,right,arr);
    }

    /* Modified Merge function */
    public static void modifiedMergeFn(int[] arr1, int[] arr2, int[] array) {
        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i]<=arr2[j]) {
                array[k] = arr1[i++];
            }else{
                array[k] = arr2[j++];
            }
            k++;
        }

        while(i < arr1.length) {
            array[k] = arr1[i++];
            k++;
        }

        while(j < arr2.length) {
            array[k] = arr2[j++];
            k++;
        }
    }


    /* Merge */
    public static int[] mergeFnOfMergeSort(int[] arr, int low, int mid, int high) {
        /* Create Two Arrays */
        // Left Array
        int[] left = new int[mid - low + 1];

        // Right Array
        int[] right = new int[high - mid];

        /* Fill Arrays with Data */
        // Fill first Array
        int i;
        for ( i = 0; i <= mid && i < left.length; i++) {
            left[i] = arr[i];
        }

        // Fill Second Array
        for (int j = 0; j < right.length && i <= high; j++) {
            right[j] = arr[i++];
        }

        return mergeFn(left,right);
    }

    /* Merge Function */
    public static int[] mergeFn(int[] arr1, int[] arr2) {

        int[] out = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i]<=arr2[j]) {
                out[k] = arr1[i++];
            }else{
                out[k] = arr2[j++];
            }
            k++;
        }

        while(i < arr1.length) {
            out[k] = arr1[i++];
            k++;
        }

        while(j < arr2.length) {
            out[k] = arr2[j++];
            k++;
        }
        return out;
    }
}
