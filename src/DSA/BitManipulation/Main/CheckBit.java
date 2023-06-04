package DSA.BitManipulation.Main;

/* Q - Check if kth bit is set or Not */

public class CheckBit {
    public static void main(String[] args) {
        System.out.println(checkFunction(8,4)); //true
        System.out.println(checkFunction1(1,1));
        System.out.println(checkFunction(7,2));
        System.out.println(checkFunction1(0,2));
        System.out.println(checkFunction(100,40));
    }

    /* Using (<<) left shift Operator */
    public static boolean checkFunction1(int n, int k) {
        // Edge Case
        if(n == 0 || k > Integer.SIZE) {
            return false;
        }

        int leftShift = k-1;
        int oneNumber = 1;
        if((n & (oneNumber << leftShift)) != 0) {
            return true;
        }

        return false;
    }

    /* Using (>>) right shift operator */
    public static boolean checkFunction(int n, int k) {
       if(n == 0 || k > Integer.SIZE) {
           return false;
       }
       int rightSift = k-1;
       int oneNumber = 1;
       if((oneNumber & (n >> rightSift)) == 1) {
           return true;
       }

       return false;
    }

}
