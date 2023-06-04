package DSA.Math;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calFactorial2(0));
        System.out.println(calFactorial2(1));
        System.out.println(calFactorial2(3));
        System.out.println(calFactorial2(8));
    }
    public static int calFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static int calFactorial2(int n) {
        if(n < 2) return 1;

        return n * calFactorial2(n-1);
    }
}
