package DSA.Array.Questions;

public class ReverseAnArray {
    public static void main(String[] args){
        int[] firstArray = new int[]{1,2};
        System.out.println("Array - Before");
        printArray(firstArray);
        System.out.println("Array - After");
        reserveArray2(firstArray);
        printArray(firstArray);
        printArray(new int[10]);
    }
    /* Reverse an Array */
    /* My Solution */
    public static void reserveArray(int[] arr){
        /* We need Two Pointer variables for this problem */
        int p1 = 0; // first index
        int p2 = arr.length - 1; // last index
        int i = 1;
        while(i<=(arr.length/2)){
            swap(arr,p1,p2);
            p1 = p1 + 1;
            p2 = p2 - 1;
            i = i + 1;
        }
    }

    /* Sandeep Sir's Solution
    *  Almost Same */
    public static void reserveArray2(int[] arr){
        /* We need Two Pointer variables for this problem */
        int p1 = 0; // first index
        int p2 = arr.length - 1; // last index

        while(p1<p2){
            swap(arr,p1,p2);
            p1 = p1 + 1;
            p2 = p2 - 1;
        }
    }

    /* Swap function */
    public static void swap(int[] arr2,int p1, int p2){
        int temp = arr2[p2];
        arr2[p2] = arr2[p1];
        arr2[p1] = temp;
    }

    /* print Array */
   public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(", ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }
}
