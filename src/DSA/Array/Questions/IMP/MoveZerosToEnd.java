package DSA.Array.Questions.IMP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] numberArray = new int[]{0,0,0,1,2,0,0,0,10,20};
        System.out.println(Arrays.toString(numberArray));
        moveZeroToEnd2(numberArray);
        System.out.println(Arrays.toString(numberArray));

    }

    // Efficient Solution
    public static void moveZeroToEnd2(int[] arr) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
    }

    // Move Zeros to end
    public static void moveZeroToEnd(int[] arr) {
        boolean haveZero;
        for (int i = 0; i < arr.length; i++) {
            haveZero = false;
            if(arr[i] == 0) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] != 0) {
                        // swap
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        haveZero = true;
                    }
                }
                if(!haveZero) {
                    break;
                }
            }
        }
    }
}
