package DSA.Recursion.Master;

public class NaturalNumber {
    public static void main(String[] args) {
        System.out.println(findNN(3));
        System.out.println(findNN(5));
    }
    public static int findNN(int n) {
        if(n == 1) return 1;
        return n + findNN(n-1);
    }
}
