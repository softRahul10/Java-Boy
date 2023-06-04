package DSA.Array.Questions;

public class CheckIfArrayIsSorted {

    public static void main(String[] args){
        int[] sampleInput = {100,20,200};
        System.out.println(isSorted(sampleInput));
    }

    /* Check if an array is sorted or not? */
    public static boolean isSorted(int[] arr){
        boolean isSorted = true;

        /* Logic */
        if(arr[0]>arr[arr.length-1]){
            return false;
        }
        for(int index=0; index<arr.length-1; index += 1){
            if(arr[index]>arr[(index+1)]){
                return false;
            }
        }

        return isSorted;
    }
}
