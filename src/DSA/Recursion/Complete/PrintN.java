package DSA.Recursion.Complete;

public class PrintN {
    public static void main(String[] args) {
        print2(5);
    }

    public static void print(int n) {
        if(n<1) {
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    /* print from 1 to N */
    public static void print2(int n) {
        if(n == 0) return;
        print2(n-1);
        System.out.println(n);
    }
}
