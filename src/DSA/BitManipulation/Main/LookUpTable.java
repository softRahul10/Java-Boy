package DSA.BitManipulation.Main;

import java.util.Arrays;

public class LookUpTable {
    private static int[] table = new int[256]; // [0,255]
    public static void initializeTable() {
        table[0] = 0;
        for (int i = 1; i < 256; i++) {
            table[i] = (i&1) + table[i/2];
        }
        System.out.println(Arrays.toString(table));
    }

    public static void main(String[] args) {
        initializeTable();
        int result = countBits(661234);
        System.out.println(result);
    }
    /* Lookup Table */
    public static int countBits(int n) {
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
