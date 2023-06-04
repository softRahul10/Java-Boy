package DSA.BinarySearch.Questions;

public class FindFirstOccurrence {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,4,4,4,4,8,10};
        System.out.println(findFirst(nums,1));

    }
    // Find First Occurrence of an element in sorted Array
    public static int findFirst(int[] array,int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if(array[mid] > target) {
                high = mid - 1;
            }else if(array[mid] < target) {
                low = mid + 1;
            }else{
                if(mid == 0 || array[mid] != array[mid-1]) {
                    return mid;
                }else{
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
