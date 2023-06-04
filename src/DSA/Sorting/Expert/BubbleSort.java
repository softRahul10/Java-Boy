package DSA.Sorting.Expert;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,2,4,3};
        System.out.println(Arrays.toString(array));
        bubbleSortOptimized(array);
        System.out.println(Arrays.toString(array));
    }

    void bubbleSortInJava(int[] array) {
        boolean swap;
        for (int i = 0; i < array.length-1; i++) {
            swap = false;
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }

    /* Bubble Sort */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /* optimized Bubble sort */
    public static void bubbleSortOptimized(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length-1; i++) {
            swap = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }

    /* Swap */
    public static void swap(int[] arr, int value1, int value2) {
        int temp = arr[value2];
        arr[value2] = arr[value1];
        arr[value1] = temp;
    }
}
