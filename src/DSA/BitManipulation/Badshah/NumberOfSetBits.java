package DSA.BitManipulation.Badshah;

public class NumberOfSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits2(8));
        System.out.println(countSetBits2(0));
    }

    // Method 2
    public static int countSetBits2(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }


    // Naive approach
    public static int countSetBits(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(((1 << i) & n) != 0) {
                count++;
            }
        }
        return count;
    }
}
