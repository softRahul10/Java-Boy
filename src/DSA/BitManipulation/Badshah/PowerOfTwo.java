package DSA.BitManipulation.Badshah;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(power(0)); // false;
        System.out.println(power(1)); // true
        System.out.println(power(8)); // true
        System.out.println(power(7)); // false
    }
    public static boolean power(int n) {
        return (n != 0) && ((n & (n-1)) == 0);
    }
}
