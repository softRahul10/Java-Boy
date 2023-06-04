package DSA.Sorting.Custom;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,4};
        System.out.println("Sort in Ascending Order");
        System.out.println(Arrays.toString(array1));
        sortInAscendingOrder(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println("Sort in Descending Order");
        System.out.println(Arrays.toString(array2));
        sortInDescendingOrder(array2);
        System.out.println(Arrays.toString(array2));


    }
    
    /* My Bubble Sort */
    /* Sort in Ascending Order*/
    public static void sortInAscendingOrder(int[] arr) {
        for(int i=0; i < arr.length-1; i++) {
            boolean isSwap = false;
            for(int j=0; j < arr.length - 1 - i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap) {
                break;
            }
        }
    }

    /* Sort in Desending Order */
    public static void sortInDescendingOrder(int[] arr) {
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr.length - 1 - i; j++) {
                if(arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
