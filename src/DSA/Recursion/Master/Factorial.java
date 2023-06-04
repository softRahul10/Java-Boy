package DSA.Recursion.Master;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(0));
        System.out.println(fac(1));
        System.out.println(fac(5));
        System.out.println(fac(3));
    }

    public static int fac(int n) {
        if(n < 2) return 1;
        return n * fac(n-1);
    }

    public static int fibo(int n) {
        if(n <= 1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}
