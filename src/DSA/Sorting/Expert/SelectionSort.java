package DSA.Sorting.Expert;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{4,3,2,1}));
        selectionSort(new int[]{4,3,2,1});
    }
    /* Selection sort */
    public static void selectionSort(int[] arr) {
        int minValue;
        for (int i = 0; i < arr.length-1; i++) {
            minValue = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[minValue]) {
                    minValue = j;
                }
            }
            swap(arr,i,minValue);
        }
    }
    /* swap */
    public static void swap(int[] arr, int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
