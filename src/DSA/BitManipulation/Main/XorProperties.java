package DSA.BitManipulation.Main;

public class XorProperties {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        // Swap using Xor operator
        System.out.println("Before " + " a is : " +  a  +  " and b is : "+ b);

        a = a ^ b;
        b = a ^ b; // a ^ b ^ b = a
        a = a ^ b; // a ^ b ^ a == a ^ a ^ b;

        System.out.println("After " + "a is : " + a  +  " and b is : "+ b);
    }
}
