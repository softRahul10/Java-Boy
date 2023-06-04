package DSA.Sorting.Badshah;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myUnsortedArray = new int[]{4,3,2,1};
        System.out.println(Arrays.toString(myUnsortedArray));
        selectionSort(myUnsortedArray);
        System.out.println(Arrays.toString(myUnsortedArray));
    }
    // Selection sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
