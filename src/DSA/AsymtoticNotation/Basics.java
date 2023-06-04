package DSA.AsymtoticNotation;

public class Basics {
    public static void main(String[] args) {

    }


    /* Algorithmic Analysis */
    /* Find Number */
    public static int findNumber(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return  -1;
    }



















    /* Print 1 to n Numbers */
    /* Linear */
    /* 0(n) */
    public static void printNumbers(int n){
        for(int i = 1; i <= n; i++){
            System.out.print(" " + i + " ,");
        }
    }

    /* Add One */
    /* Constant */
    /* 0(1) */
    public static int addOne(int n){
        return (n+1);
    }
}
