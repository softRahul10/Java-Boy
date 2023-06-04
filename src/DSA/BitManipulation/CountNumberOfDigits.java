package DSA.BitManipulation;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int n = 125;
        int val = countDigit3(n);
        System.out.println("Number of Digits in " + n + " are : " + val);
    }
    /* Approach 1*/
    public static int countDigit(int n) {
        int count = 0;
        while(n>0) {
            count++;
            n = n/10;
        }
        return count;
    }

    /* Approach 2 */
    public static int countDigit2(int n) {
        return n != 0 ? ((int)Math.floor(Math.log10(n)+1)): -1;
    }

    /* Approach 3 */
    public static int countDigit3(int n) {
        String str = Integer.toString(n);
        return str.length();
    }
}
