package DSA.Sorting.Expert.MergeSort.Expert;

import java.util.Arrays;

public class MergeCall {
    public static void main(String[] args) {
        int[] partiallySorted = {10,20,40,20,30};

        System.out.println("Before Merge Operation -----> " + Arrays.toString(partiallySorted));

        int s = 0;
        int e = partiallySorted.length - 1;
        int mid = s + (e-s)/2;

        mergeInSameArray(partiallySorted,s,mid,e);

        System.out.println("After Merging  -----> " + Arrays.toString(partiallySorted));

    }

    /* Merge call */
    private static void mergeInSameArray(int[] arr, int l, int m, int h) {
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
