package DSA.Sorting.Badshah;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int[] unsortedArray = new int[]{100,40,60,1};
        sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
    
    /* Radix Sort Algo */
    public static void sort(int[] arr) {
        // Step1: find max
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Step2: run a loop  Number of Digit times
        for (int ex = 1; (max/ex) >  0; ex = ex * 10) {
            sort2(arr,ex);
        }
    }

    // Counting sort
    public static void sort2(int[] arr,int ex) {
        int[] count = new int[10];
        int[] out = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[(arr[i]/ex)%10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i-1] + count[i];
        }

        for (int i = arr.length-1; i >= 0 ; i--) {
            out[count[(arr[i]/ex)%10] -1] = arr[i];
            count[(arr[i]/ex)%10]--;
        }

        for (int i = 0; i < out.length; i++) {
            arr[i] = out[i];
        }
    }
}
