package DSA.PrintPattern;

public class Patterns {
    public static void main(String[] args) {
        pattern2(4);
        System.out.println();
        pattern3(8);
        System.out.println();
        pattern4(12);
        System.out.println();
        pattern5(20);
        System.out.println();
        pattern55(5);
    }

    /* Pattern 2 */
    public static void pattern2(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Pattern 3 */
    public static void pattern3(int n) {
       for( int i=n; i >= 1; i--) {
           for (int j = 1; j <= i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
    }

    /* Pattern 4 */
    public static void pattern4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    /* Pattern 5 */
    public static void pattern5(int n) {
        int n2 = (n-1);
        for (int i = 1; i <=(n+(n-1)) ; i++) {
            if(i > n) {
                for (int j = n2; j >= 1 ; j--) {
                    System.out.print("* ");
                }
                n2--;
            }else{
                for (int j = 1; j <= i ; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }

    /* With Formula */
    public static void pattern55(int n) {
        for (int i = 1; i <= (2*n - 1) ; i++) {
            int cols = i > n ? 2*n - i: i;
            for (int j = 1; j <= cols ; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}
