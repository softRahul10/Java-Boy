package Questions.BitManipulation;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = in.nextInt();
        int numberOfSetBits = countNumberOfBits4(number);
        System.out.println("Set Bits in " + number + " is : " + numberOfSetBits);
    }

    /* My Approach for Problem */
    /* TIME COMPLEXITY :  0(n) n = number of Bits */
    public static int countNumberOfBits(int n){
        int i = 0;
        int numberOfBits = 0;
        int numberOne = 1;
        while(i<32){
            if((n & (numberOne << i)) != 0){
                numberOfBits++;
            }
            i++;
        }

        return  numberOfBits;
    }

    /* Sir's Approach (Naive Solution) */
    /* 0(Number of Bits) Better Approach than My */
    public static int countNumberOfBits2(int n){
        int result = 0;
        while(n>0){
            if(n%2 != 0){
                result++;
            }
            n = n/2;
        }
        return result;
    }
    public static int countNumberOfBits3(int n){
        int result = 0;
        while(n>0){
            if( (n&1) == 1){
                result++;
            }
            n = n>>1;
        }
        return result;
    }

    /* Brian Kerningam's Algorithm */
    /* TIME COMPLEXITY : 0(set bit) */
    public static int countNumberOfBits4(int n){
        int result = 0;
        while(n>0){
            n = (n&(n-1));
            result += 1;
        }
        return  result;
    }
}
