package DSA.Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        printNumberReverse(5);
    }
    /* My solution */
    public static void printNumber(int n){
        if(n<1) {
            return;
        }
        else {
            System.out.println(n);
            printNumber(n-1);
        }

    }

    public static void printNumberReverse(int n){
        if(n == 0)
            return;
        printNumberReverse(n-1);
        System.out.println(n);
    }

    /* Sandeep Sir's Solution */
    public static void printNumber2(int n){
        if(n == 0)
            return;
        System.out.println(n);
        printNumber2(n-1);
    }


}
