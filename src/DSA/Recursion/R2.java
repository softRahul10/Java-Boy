package DSA.Recursion;

public class R2 {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6};
        int  res = recursiveLinearSearch(number,6,0);
        System.out.println("Index is : " + res);
    }

   public static int recursiveLinearSearch(int[] array, int target,int index){
        /* Base Case */
        if(index >= array.length){
            return -1;
        }
        if(array[index] == target){
            return index;
        }
             return recursiveLinearSearch(array,target,++index);
    }
}
