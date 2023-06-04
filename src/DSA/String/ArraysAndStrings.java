package DSA.String;

import java.util.Scanner;

public class ArraysAndStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("name:");
        StringBuilder name = new StringBuilder(in.nextLine());
        System.out.println(name);
        reverseString(name);
        System.out.println(name);
    }

    /* Reverse String == Reverse Array */
    public static void reverseString(StringBuilder str) {
        int low = 0;
        int high = str.length() - 1;
        int count = 0;
        while(low < high ) {
            swapChar(str, low, high);
            low++;
            high--;
            count++;
        }
        System.out.println("Loop count is " + count);
    }

    /* Swap */
    public static void swapChar(StringBuilder str, int li, int hi) {
        char tempChar = str.charAt(li);
        str.setCharAt(li,str.charAt(hi));
        str.setCharAt(hi, tempChar);
    }

}
