package DSA.Sorting.Badshah;

import java.util.Arrays;

public class BubbleSort {
    // Main Driver Code
    public static void main(String[] args) {
        int[] myNotSortedArray = {1,2,3,4};
        System.out.println(Arrays.toString(myNotSortedArray));
        bubbleSort(myNotSortedArray);
        System.out.println(Arrays.toString(myNotSortedArray));
    }

    // Bubble Sort Algo
    public static void bubbleSort(int[] arr) {
        // Best Optimized Bubble Sort
        boolean notSwapping;
        for (int i = 0; i < arr.length-1; i++) {
            notSwapping = true;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    swap(arr,j,(j+1));
                    notSwapping = false;
                }
            }
            if(notSwapping) {
                break;
            }
        }
    }
    // Swap function
    private static void swap(int[] arr, int v1, int v2) {
        int temp = arr[v1];
        arr[v1] = arr[v2];
        arr[v2] = temp;
    }
}

