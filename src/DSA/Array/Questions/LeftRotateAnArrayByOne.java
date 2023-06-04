package DSA.Array.Questions;

import java.util.Arrays;

public class LeftRotateAnArrayByOne {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));

        rotateArrayByN3(array,2);
        System.out.println(Arrays.toString(array));

    }

    /* Left Rotate an Array by One */
    /* My solution */
    public static void rotateArray(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++ ){
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    /* Left Rotate an Array by D places*/
    /* Brute Force*/
   public static void rotateArrayByN(int[] arr, int d){
        /* Edge Case */
        if(d>arr.length){
            d = d - arr.length;
            if(d>arr.length)
                d = d - arr.length;
        }

        if(d == arr.length){
            return;
        }

        for(int i = 1; i <= d; i++){
            rotateArray(arr);
        }
    }

    /* Efficient */
    public static void rotateArrayByN2(int[] arr, int d) {
        /* Create an Array (size=d) */
        int[] temp = new int[d];

        /* Copy first D Elements */
        for( int i=0; i < d; i++) {
            temp[i] = arr[i];
        }

        /* Move Elements By D Places */
        for( int j=d; j < arr.length; j++) {
            arr[j - d] = arr[j];
        }

        /* Insert temp Element in Arr */
        for( int k=0; k < d; k++) {
            arr[arr.length - d + k] = temp[k];
        }

    }

    /* Best Solution */
    /* Time - 0(n), Space - 0(1) */
    public static void rotateArrayByN3(int[] arr, int d){
        /* Reverse First D elements */
        reverseArray(arr, 0, d - 1);

        /* Reverse Elements After D till n - 1 */
        reverseArray(arr,d,arr.length - 1);

        /* Finally, Reverse The Whole Array */
        reverseArray(arr, 0, arr.length - 1);

    }
    /* Reverse Method */
    public static void reverseArray(int[] arr, int low, int high) {
        while( low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }


}
