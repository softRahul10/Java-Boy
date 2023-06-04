package DSA.Array.Questions.IMP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(myArray));
        leftRotation3(myArray,2);
        System.out.println(Arrays.toString(myArray));
    }

    // Left Rotate An Array by d places
    // Efficient Solution
    public static void leftRotation3(int[] arr, int d) {
        if(arr.length == d) return;
        if(arr.length < d) {
            d = d - arr.length;
        }

        // Main Logic
        // 1. First Reversal [0,d-1]
        reverseArray(arr,0,d-1);

        // 2. Second Reversal [d,n-1]
        reverseArray(arr,d, arr.length-1);

        // 3. Third Reversal : Reverse whole Array
        reverseArray(arr,0, arr.length-1);

    }

    // reverse function
    private static void reverseArray(int[] arr, int l, int h) {
        while(l < h) {
            int temp = arr[h];
            arr[h] = arr[l];
            arr[l] = temp;
            l++;
            h--;
        }
    }









    // using extra memory
    public static void leftRotation2(int[] arr,int d) {
        if(arr.length == d) return;
        if(arr.length < d) d = d - arr.length;

        int[] temp = new int[d];
        // fill with data
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Move elements d places
        for (int i = d; i < arr.length; i++) {
            arr[i-d] = arr[i];
        }

        // adding temp data to original array
        for (int i = 0; i < d; i++) {
            arr[arr.length - d + i] = temp[i];
        }
    }




    // Naive Approach : Time 0(n*d)
    public static void leftRotation(int[] arr, int d) {
        if(arr.length == d) return;
        if(arr.length < d) {
            d = d - arr.length;
        }
       while(d != 0) {
           int temp = arr[0];
           for (int i = 1; i < arr.length; i++) {
               // move elements one position before
               arr[i-1] = arr[i];
           }
           arr[arr.length - 1] = temp;
           d--;
       }
    }

    // Left Rotate An Array by 1 Place
    public static void rotateLeft(int[] arr) {
        System.out.println("Array Rotation : Left ");
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // move elements one position before
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }


    // Right Rotate An Array by 1 Place
    public static void rotateRight(int[] arr) {
        System.out.println("Array Rotation : Right");
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0 ; i--) {
            // move elements one position ahead
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
}
