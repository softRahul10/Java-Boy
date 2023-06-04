package DSA.Recursion.Complete;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Fibonacci Number of 3 : " + fibo2(3));
        /*for (int i = 1; i <= 10 ; i++) {
            System.out.println("Fibo Number of " + i + " is :" + fibo(i));
        }*/
    }
    public static int fibo(int n) {
        int n1 = 0, n2 = 1;
        int res = n==1?1:0;
        for (int i = 2; i <= n ; i++) {
            res = n1 + n2;
            n1  = n2;
            n2 = res;
        }
        return res;
    }

    // Recursive Solution
    public static int fibo2(int n) {
        if(n < 2) {
            return n;
        }

        return fibo2(n-1) + fibo2(n-2);
    }
}
