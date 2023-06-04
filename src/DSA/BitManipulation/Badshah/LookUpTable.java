package DSA.BitManipulation.Badshah;

import java.util.Arrays;

public class LookUpTable {
    private static int[] table;
    private static void initialTable() {
        table = new int[256];
        table[0] = 0;
        for (int i = 1; i < 256; i++) {
            table[i] = (i&1) + table[i/2];
        }
    }
    public static void main(String[] args) {
        initialTable();
        int res = countSetBits(7);
        System.out.println(res);
    }

    // Count set bits in a number using Lookup Table Method
    public static int countSetBits(int n) {
        int res = table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        return res;
    }
}
