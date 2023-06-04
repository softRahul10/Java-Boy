package DSA.Array.ArrayRevision.Operations;

public class LinearSearch {
    public static void main(String[] args) {
        int[] myArray = new int[]{10,20,1,2,0,5};
        System.out.println(basicSearch(myArray,51));
    }
    // Linear Search
    public static int basicSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
