package DSA.Sorting.Badshah;

import java.util.Arrays;

public class PartitionOfArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(partitionOfArray(new int[]{5,13,6,9,12,11,8},6)));
        System.out.println();
    }

    // Naive Partition
    public static int[] partitionOfArray(int[] array, int idx) {
        //1. New array
        int[] temp = new int[array.length];

        // 2. small values
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[idx]) {
                temp[pos] = array[i];
                pos++;
            }
        }
        // 3. equal or same values
        for (int i = 0; i < array.length; i++) {
            if(array[i] == array[idx]) {
                temp[pos] = array[i];
                pos++;
            }
        }
        // 4. large values
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[idx]) {
                temp[pos] = array[i];
                pos++;
            }
        }
        return temp;
    }
}
