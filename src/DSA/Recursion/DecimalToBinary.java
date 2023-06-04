package DSA.Recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        binary(100);
    }
    public static void binary(int n){
        if(n == 0)
            return;
        binary(n/2);
        System.out.print(n%2);
    }
}
