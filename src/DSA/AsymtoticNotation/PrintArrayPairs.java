package DSA.AsymtoticNotation;

public class PrintArrayPairs {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        printPair(array);
    }

    /* Print Pairs of an Array */
   public static void printPair(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(" [ " + arr[i] + "," + arr[j] + " ] ");
            }
            System.out.println();
        }
    }
}
