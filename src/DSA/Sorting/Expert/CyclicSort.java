package DSA.Sorting.Expert;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] num = {3,2,1,4};
        System.out.println(Arrays.toString(num));
        sort(num);
        System.out.println(Arrays.toString(num));
    }

    /* Cyclic Sort By Kunal */
    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
