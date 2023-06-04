package DSA.BitManipulation.Badshah;

import java.util.Arrays;

public class TwoOddNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[]{3,3,4,8,4,6,5,6,5,9};
        System.out.println(Arrays.toString(findTwoOddNumbers(numbers)));
    }
    public static int[] findTwoOddNumbers(int[] arr) {
        int[] result = new int[2];
        int xor = 0;
        int n1 = 0;
        int n2 = 0;

        //Step 1: Take xor of every number
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        //Step 2: Find Right most set bit of xor number
        xor = xor & (~(xor - 1));

        for (int i = 0; i < arr.length; i++) {
            if((arr[i] & xor) != 0) {
                n1 = n1 ^ arr[i];
            }else{
                n2 = n2 ^ arr[i];
            }
        }

        result[0] = n1;
        result[1] = n2;

        return result;
    }
}
