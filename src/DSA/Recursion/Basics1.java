package DSA.Recursion;

public class Basics1 {
    public static void main(String[] args) {
        System.out.println(findFactorialIterative(5));
    }

    /* Find Factorial */
    /* Loop */
    public static int findFactorialIterative(int n) {
        int res = 1;
        for( int i=2; i <= n; i++){
            res =+ i * res;
        }
        return res;
    }




    public static String inception(int n){
        if(n > 3){
            return "Done";
        }
        n++;
        return inception(n);
    }
}
