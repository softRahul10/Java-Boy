package DSA.Sorting.Custom;

import java.util.Arrays;

public class MergeFunForSort {
    public static void main(String[] args) {
        int[] nums = {10,15,20,11,30};
        int s = 0;
        int e = nums.length - 1;
        int m = s+e/2;
        System.out.println("Before merge : "+ Arrays.toString(nums));
        mrFn2(nums,s,m,e);
        System.out.println("After merge : " + Arrays.toString(nums));
    }


    /* Approach 2 */
    public static void mrFn2(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low+i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[n1+i];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n1 && j < n2) {
           if(left[i] <= right[j]) {
               arr[k] = left[i];
               i++;
           }else{
               arr[k] = right[j];
               j++;
           }
           k++;
        }
        while(i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }


    public static int[] mrFn(int[] arr,int s, int m, int e) {
        /* New::: Array */
        int[] temp = new int[arr.length];
        int i = s;
        int j = m + 1;
        int k = 0;
        while(i <= m && j <= e) {
            if(arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= m) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= e) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        return temp;
    }
}
