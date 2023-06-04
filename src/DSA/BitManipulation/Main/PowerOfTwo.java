package DSA.BitManipulation.Main;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("N: ");
        int num = in.nextInt();
        boolean result = method2(num);
        System.out.println(num + " is Power of 2 : " + result);
    }

    // Method 2 ( Best )
    public static boolean method2(int n) {
       return (n != 0 && (n&(n-1)) == 0);
    }

    // Method 1 ( Naive )
    public static boolean method1(int n) {
        if(n == 0) {
            return false;
        }

        while(n != 1) {
            if(n % 2 != 0) {
                return false;
            }
            n = n/2;
        }
        return true;
    }


    // My logic
    public static boolean isPowerOfTwo(int n) {
        if(n == 1) {
            return true;
        }
        int res = 0;
        while( n > 0) {
            n = n & (n-1);
            res++;
            if(res > 1) break;
        }

        return res == 1;

    }
}
