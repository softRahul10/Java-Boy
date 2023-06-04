package DSA.SearchingInArray;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,60,60};
        System.out.println(Arrays.toString(array));
        int res = searchBinary(array,60);
        System.out.println(" 60 present @ Index  Number : " + res);
    }

    /* Binary Search */
    public static int searchBinary(int[] arr, int key){
        int p1 = 0;
        int p2 = arr.length - 1;
        while(p1<=p2){
            int mid = p1 + (p2 -p1) / 2;
            if(key == arr[mid]){
                return mid;
            }
            if(key > arr[mid]){
                p1 = mid + 1;
            }

            if(key < arr[mid]){
                p2 = mid - 1;
            }
        }

        return -1;
    }


}
