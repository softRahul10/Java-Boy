package DSA.Sorting.Expert;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(array));
        insertionSortTwo(array);
        System.out.println(Arrays.toString(array));
    }

    /* Insertion Sort */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    /* Insertion Sort (Descending) */
    public static void insertionSortTwo(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] < key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
