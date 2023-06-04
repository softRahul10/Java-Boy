package DSA.Sorting.Badshah.QuickSort;

import java.util.Arrays;

public class HoarePartition {

    public static void main(String[] args) {
        int[] array = {8,4,12,20,9,4,1};
        int result = partition(array,0,array.length -1);
        System.out.println(Arrays.toString(array));
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l - 1;
        int j = h + 1;
        while (true) {
            do {
                i++;
            }while(arr[i] < pivot);

            do{
                j--;
            }while(arr[j] > pivot);
            if(i >= j) return j;
            swap(arr,i,j);
        }
    }
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
