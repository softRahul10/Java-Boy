package DSA.Recursion.Complete;

public class NaturalNumberSum {
    public static void main(String[] args) {
        int res = findSum(5);
        System.out.println("Result is " + res);
    }
    /* find natural number sum using recursion */
    public static int findSum(int n) {
        /* Base Case */
        if(n == 1) return 1;
        return n+findSum(n-1);
    }
}
