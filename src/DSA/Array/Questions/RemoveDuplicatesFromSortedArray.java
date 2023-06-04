package DSA.Array.Questions;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] array = {10,12,12,20,30};
        int s = array.length;

        System.out.println("Array Size Before Operation: " + s);
        ReverseAnArray.printArray(array);

        int size = removeDuplicate4(array,s);
        System.out.println("Array Size After Operation: " + size);
        ReverseAnArray.printArray(array);
    }

    /* My Second Solution */
    public static int removeDuplicate2(int[] arr,int size){
        /* Create a new Array */
        int[] newArray = new int[arr.length];
        int newSize = 1;
        newArray[0] = arr[0];

        /* Loop */
        int j = 1;
        for(int index = 1; index<arr.length; index++){
            if(arr[index] != newArray[j-1]){
                newArray[j] = arr[index];
                j++;
                newSize++;
            }
        }


        return newSize;
    }

    /* Sandeep Sir's Solutions */
    /* Naive Approach Time-0(n), Space-0(n) */
    public static int removeDuplicate3(int[] arr,int size){
        /* Create a new Array */
        int[] newArray = new int[arr.length];
        int newSize = 1;
        newArray[0] = arr[0];

        /* Loop */
        for(int index = 1; index<arr.length; index++){
            if(arr[index] != newArray[newSize-1]){
                newArray[newSize] = arr[index];
                newSize++;
            }
        }

        /* copy Array into actual array */
        for(int i =0; i<newSize;i++){
            arr[i] = newArray[i];
        }

        return newSize;
    }

    /* Efficient Approach */
    /* Time - O(n) , Space - O(1) */
   public static int removeDuplicate4(int[] arr, int size){
        int res = 1;

        /*Approach*/
        for(int n = 1; n < arr.length; n++){
            if(arr[n] != arr[res-1]){
                arr[res] = arr[n];
                res++;
            }
        }

        return res;
    }




    /*My Solutions*/
    /* Remove Duplicates Elements from a Sorted Array */
    public static int removeDuplicate(int[] arr, int size){
        int p = 0;
        int i = 1;
        while(i<=arr.length){
            if(arr[p] == arr[p+1]){
                size--;
                delete(arr,(p+1),arr.length-1);
            }else{
                p++;
            }
            i++;
        }
        return size;
    }

    /* Delete Method */
    public static void delete(int[] arr, int start, int end){
        for(int i = start; i<end; i++){
            arr[start] = arr[start+1];

        }
        arr[start+1] = 0;
    }
}
