package DSA.Sorting.Custom;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {10,8,30,7,0,2,1,100};
        System.out.println(Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("Sort : Ascending");
        System.out.println(Arrays.toString(nums));

        selectionSort2(nums);
        System.out.println("Sort : Descending");
        System.out.println(Arrays.toString(nums));
    }

    // My solution
    public static void selectionSort(int[] nums) {
        for(int ii=0; ii<nums.length-1; ii++) {
            int initialMin = ii;
            for(int jj = ii + 1; jj < nums.length; jj++) {
                if(nums[jj] < nums[initialMin]) {
                    initialMin = jj;
                }
            }
            // Swap
            swapNumber(nums,ii,initialMin);
        }
    }

    // Sorting in Descending order
    public static void selectionSort2(int[] nums) {
        for(int ii=0; ii<nums.length-1; ii++) {
            int initialMin = ii;
            for(int jj = ii + 1; jj < nums.length; jj++) {
                if(nums[jj] > nums[initialMin]) {
                    initialMin = jj;
                }
            }
            // Swap
            swapNumber(nums,ii,initialMin);
        }
    }

    public static void swapNumber(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
