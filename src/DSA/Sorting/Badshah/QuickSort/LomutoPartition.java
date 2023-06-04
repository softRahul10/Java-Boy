package DSA.Sorting.Badshah.QuickSort;

import java.util.Arrays;

public class LomutoPartition {
    public static void main(String[] args) {
        int[] nums = {3,1,6,9,10,30,8};
        System.out.println("Before " + Arrays.toString(nums));
        int pivotIndex = partition(nums,0,nums.length-1);
        System.out.println("After" + Arrays.toString(nums));
    }
  // Lomuto Partition
    public static int partition(int[] arr,int l,int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j <= h-1; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }
    public static void swap(int[] arr, int val1, int val2) {
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }
}