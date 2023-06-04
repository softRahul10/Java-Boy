package DSA.Array.ArrayRevision.Operations;

public class BinarySearch {
    public static void main(String[] args) {
        // Array must be sorted : if we want to apply Binary Search algo
        int[] tableOfTwo = {2,4,6,8,10,12};
        int result = advanceSearch(tableOfTwo,12);
        System.out.println(result);
    }

    // Binary Search
    public static int advanceSearch(int[] arr, int target) {
        // Binary Search -> Array must be sorted
        int s = 0; // first index (s);
        int e = arr.length - 1; // last index (e);

        while(s<=e) {
            // Find mid
            int mid = s + (e-s)/2; // Avoid Size -> Overflow
            if(target == arr[mid]) {
                return mid;
            }else if(target > arr[mid]) {
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
