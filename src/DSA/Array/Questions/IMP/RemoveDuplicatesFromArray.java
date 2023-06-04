package DSA.Array.Questions.IMP;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,20,30,30,30,30};
        System.out.println(removeDuplicatesFromArray(numbers));
    }

    // Sir's Solution
    public static int removeDuplicates(int[] arr) {
        int res = 1; // Because we know that, first element is always unique
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    // Remove Duplicates From Array
    public static int removeDuplicatesFromArray(int[] arr) {
        // find Duplicates
        int numberOfDuplicates = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) {
                arr[i] = 0;
                numberOfDuplicates++;
            }
        }
        System.out.println(Arrays.toString(arr));
        // Move zeros to end
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] != 0) {
                        // swap
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return (arr.length - numberOfDuplicates);
    }
}
