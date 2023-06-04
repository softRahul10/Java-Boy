package DSA.BitManipulation.Main;

public class SwapWithoutVar {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //swapOne(x,y);
        //swapTwo(x,y);
        swapTwoBit(x,y);
    }
    /* Swap Method 1*/
    /* Naive or General way of Swapping */
    public static void swapOne(int x, int y) {
        // Create variable for storing value
        System.out.println(" Before ");
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println(" After ");
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    /* Swap Method 2 */
    /* Without using any variable */
    public static void swapTwo(int x, int y) {
        System.out.println(" Before ");
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        x = x + y; // 10 + 5  = 15
        y = x - y; // 15 - 5 = 10
        x = x - y; // 15 - 10 = 5


        System.out.println(" After ");
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    /* Swap Method 2 (using Bit Manipulation) */
    public static void swapTwoBit(int x, int y) {
        System.out.println(" Before ");
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        x = x ^ y; // x = 15
        y = x ^ y; // y = 10
        x = x ^ y; // x = 5


        System.out.println(" After ");
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}
