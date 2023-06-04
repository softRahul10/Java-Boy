package DSA.PrintPattern;

public class Pattern1 {
    public static void main(String[] args) {
         patter1(10);
    }

    /* Pattern 1 */

    public static void patter1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
