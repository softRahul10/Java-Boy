package DSA.Sorting.Badshah.QuickSort;

import java.util.Arrays;

public class NaivePartition {
    public static void main(String[] args) {
        int[] nums = new int[]{5,13,6,9,12,11,8};
        System.out.println(Arrays.toString(nums));
        partition(nums,0,nums.length-1,6);
        System.out.println(Arrays.toString(nums));
    }
    public static void partition(int[] arr, int l, int h, int pivot) {
        int[] temp = new int[h-l+1];
        int pos = 0;
        for (int i = l; i <= h ; i++) {
            if(arr[i] < arr[pivot]) {
                temp[pos] = arr[i];
                pos++;
            }
        }
        for (int i = l; i <= h; i++) {
            if(arr[i] == arr[pivot]) {
                temp[pos] = arr[i];
                pos++;
            }
        }
        for (int i = l; i <= h; i++) {
            if(arr[i] > arr[pivot]) {
                temp[pos] = arr[i];
                pos++;
            }
        }
        for (int i = l; i <= h; i++) {
            arr[i] = temp[i];
        }

    }
}
