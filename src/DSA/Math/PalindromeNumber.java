package DSA.Math;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(78987));
    }
    public static boolean isPalindrome(int n) {
       int res = 0;
       int temp = n;
       while(temp != 0) {
           int lastDigit = temp % 10;
           res = res * 10 + lastDigit;
           temp = temp / 10;
       }
       return res == n;
    }
}
