package DSA.Recursion.Master;

public class PrintNto1 {
    public static void main(String[] args) {
        print(6);
    }

    public static void print(int n) {
        // Base case
        if(n == 0) {
            return;
        }
        System.out.println(n);
        print(n-1); // Tail Recursive
    }
}
