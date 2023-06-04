package DSA.Sorting.Badshah.QuickSort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] data = new int[]{1,1,1,1,0,0,0,4,3,2,2,2,2,2,2,2};
        System.out.println(Arrays.toString(data));
        countCountSort(data,5);
        System.out.println(Arrays.toString(data));
    }


    // Counting Sort : Efficient Approach

    public static void countCountSort(int[] values, int k) {
        int[] count = new int[k];
        int[] result = new int[values.length];

        for(int value:values) {
            count[value]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i-1] + count[i];
        }

        for (int i = values.length-1; i >= 0 ; i--) {
            result[count[values[i]] - 1] = values[i];
            count[values[i]]--;
        }

        for (int i = 0; i < result.length; i++) {
            values[i] = result[i];
        }
    }


    // Counting Sort : Naive approach
    public static void countSort(int[] arr, int k) {
        // Create a new array of size k
        int[] temp = new int[k];

        // Then , count occurrences of numbers in the range of 0 - k -1
        for (int value : arr) {
            temp[value]++;
        }

        // Run a loop and fill numbers in sorting order
        int index = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < temp[i]; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}
