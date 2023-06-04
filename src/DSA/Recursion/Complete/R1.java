package DSA.Recursion.Complete;

public class R1 {
    public static void main(String[] args) {
        int[] arr1 = {10,11,12,13,14};
        int[] arr2 = {9,10,11,12,13};
        System.out.println(sumDifference(arr1, arr2,5));
    }
    static int sumDifference(int[] arr1, int[] arr2, int size) {
        int maxDifference = 0;
        for(int i=0; i < size; i++) {
             maxDifference = maxDifference + arr1[i] - arr2[i];
        }
        return maxDifference;
    }
    static int dispatcher(int[] arr1, int[] arr2, int size) {
        if(size == 0) {
            return 0;
        }
        int lastDifference = arr1[size-1] - arr2[size -1];
        int diff = dispatcher(arr1,arr2,size-1);
        return diff;
    }
}
