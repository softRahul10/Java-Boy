package DSA.Sorting.Master;

import java.util.Arrays;

public class Sorting01 {
    public static void main(String[] args) {

      printReverse(new int[]{10,1,3,22,0,6,100});
      printSortedArray(new char[]{'a','e','b','c','e','z','g'});

    }
    // Sort Array using Arrays.sort() method -> Natural Number order
    public static void printSortedArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void printSortedArray(char[] arr) {
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // sort in Reverse Order
    public static void printReverse(int[] arr) {
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Reverse Array
    private static void reverseArray(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        while(l < h) {
            int temp = arr[h];
            arr[h] = arr[l];
            arr[l] = temp;
            l++;
            h--;
        }
    }


}
