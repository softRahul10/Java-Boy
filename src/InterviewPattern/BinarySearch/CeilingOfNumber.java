package InterviewPattern.BinarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,20,30,40};
        int res = findCeiling(arr,6);
        System.out.println("Index is: " + res);
    }
    /* Find Ceiling in a Sorted Array */
    /* Ceiling n >= key */
    public static int findCeiling(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(s == e && key != arr[mid]) {
                return arr[mid] > key? mid : -1;
            }
            if(key == arr[mid]) {
                return mid;
            }else if(key > arr[mid]) {
                s = mid + 1;
            }else{
                e = mid - 1;
            }

        }
        return -1;
    }

}
