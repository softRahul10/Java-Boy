package DSA.BitManipulation.Main;

import java.util.Arrays;
import java.util.Scanner;

public class CountSetBits {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" Number : ");
        int num = in.nextInt();
        int num2 = numberOfBits(num);
        System.out.println("Number of Sets Bits in " + num + " is : " + num2);
    }


    /* Brian Kernigham's Algorithm */
    // Time - O(number of sets bits)
    private static int numberOfBits1(int n) {
        int res = 0;
        while(n != 0) {
            n = (n&(n-1)); /* This is where Magic happens */
            res++;
        }
        return res;
    }


    /* My Solution */
    private static int numberOfBits(int n) {
        int x = 0;

        while(n != 0) {
            if((1 & n) == 1) {
                x++;
            }
            n = n >> 1;
        }


        return x;
    }
}
