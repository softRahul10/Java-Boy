package DSA.Sorting.Expert.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] data = {2,4,10,6,4,1};
        System.out.println(" Array Before : " + Arrays.toString(data));
        mergeSortAlgo(data,0,data.length - 1);
        System.out.println(" Array After : " + Arrays.toString(data));

    }

    /* Merge Sort */
    public static void mergeSortAlgo(int[] arr, int s, int e) {
        if(s < e) {
            // find middle
            int mid = s + (e - s)/2;
            // sort first half
            mergeSortAlgo(arr,s,mid);

            // sort second half
            mergeSortAlgo(arr,mid+1, e);

            // Merge both
            merge(arr, s,mid,e);
        }
    }

    /* Merge function */
    public static void merge(int[] arr, int s, int mid, int e) {
        int n1 = mid - s + 1;
        int n2 = e - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[s+i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[n1+j];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
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
