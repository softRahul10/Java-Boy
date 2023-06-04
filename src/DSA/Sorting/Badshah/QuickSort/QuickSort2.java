package DSA.Sorting.Badshah.QuickSort;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] number = {4,3,2,1};
        System.out.println(Arrays.toString(number));
        quickSort(number,0,number.length-1);
        System.out.println(Arrays.toString(number));
    }
    public static void quickSort(int[] arr, int l, int h) {
        if(l < h) {
            int pivot = partition(arr,l,h);
            quickSort(arr,l,pivot);
            quickSort(arr,pivot+1,h);
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l - 1;
        int j = h + 1;
        while (true) {
            do{
                i++;
            }while(arr[i] < pivot);

            do{
                j--;
            }while(arr[j] > pivot);

            if(i >= j) return j;
            swap(arr,i,j);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
