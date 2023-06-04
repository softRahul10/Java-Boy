package DSA.Sorting.Badshah.QuickSort;

import java.util.Arrays;

public class QuickSort1 {
    // Quick sort using Lomuto Partition
    public static void main(String[] args) {
        int[] myArray = new int[]{90,8,3,44,2,2,1,0,53,25,6,4};
        System.out.println(Arrays.toString(myArray));
        quickSort(myArray,0,myArray.length-1);
        System.out.println(Arrays.toString(myArray));
    }
    public static void quickSort(int[] arr, int l, int h) {
        if(l < h) {
            int p = partition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }
    public static int partition(int[] nums, int l, int h) {
        int pivot = nums[h];
        int i = l - 1;
        for (int j = l; j <= h-1; j++) {
            if(nums[j] < pivot) {
                i++;
                swap(nums,i,j);
            }
        }
        swap(nums,i+1,h);
        return i+1;
    }

    public static void swap(int[] arr,int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
}
