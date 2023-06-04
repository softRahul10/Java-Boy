package DSA.Recursion.Complete;

public class TailRecursion {
    public static void main(String[] args) {
        printN(5);
    }
    public static void printN(int n) {
        // start:
        if(n == 0) {
            return;
        }
        System.out.println(n);
        // n = n - 1;
        // goto start;
        printN(n-1);
    }
}
