package DSA.Array.Questions;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] array = {0,0,0,9};
        System.out.println("Before");
        ReverseAnArray.printArray(array);

        moveZTEBest(array);
        System.out.println("After");
        ReverseAnArray.printArray(array);
    }


    /* My Solutions */
    /* Solution 1 Time - O(n) , Space - O(n) */
   public static void moveZTE(int[] arr){
        int[] copyArr = new int[arr.length];
        int j = 0;
        int i = 0;
        while(i<arr.length){  // O(n)
            if(arr[i] != 0){
                copyArr[j] = arr[i];
                j++;
            }
            i++;
        }

        for(int index = 0; index < copyArr.length; index++){
            arr[index] = copyArr[index];  // O(n)
        }
    }

    /* Solution 2*/
    /*  Time - O(n^2) , Space - O(1) */
   public static void moveZTE2(int[] arr){
        /* Linear Search */
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }


            }
        }
    }


    /* Solution 3 */
    /* Time - O(n) , Space - O(1) */
    public static void moveZTEBest(int[] arr) {
        int j = 0;
        for(int i=0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

}
