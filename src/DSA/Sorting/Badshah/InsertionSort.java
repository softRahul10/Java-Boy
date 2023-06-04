package DSA.Sorting.Badshah;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        // Start Main Loop from 2nd element
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // Store current Index's value for future use
            int j = i - 1; // Start Secondary loop from i - 1

            while(j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }
}
