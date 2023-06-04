package DSA.BitManipulation.Badshah;

public class CheckBit {
    public static void main(String[] args) {
        System.out.println(bitSet2(8,4));
    }

    // check bit
    public static boolean bitSet(int n, int k) {
        if(k > Integer.SIZE) return false;
        return (n >> (k - 1) & 1) == 1;
    }
    // second approach
    public static boolean bitSet2(int n, int k) {
        if(k > Integer.SIZE) return false;
        return (1 << (k - 1) & n) != 0;
    }
}
