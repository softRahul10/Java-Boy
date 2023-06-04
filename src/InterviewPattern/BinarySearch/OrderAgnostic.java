package InterviewPattern.BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] number = {1,2,4,8,16,32,64};
        int[] reverseNumber = {64,32,16,8,4,2,1};
        int result = bnSearch(reverseNumber,32);
        System.out.println(result);
    }

    /* Order Agnostic Binary Search */
   public static int bnSearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        boolean isAscending = arr[s] < arr[e];
        while (s <= e) {
            int mid = s + (e - s)/2;
            if(target == arr[mid]) return mid;
            if(isAscending) {
                if(target > arr[mid]) s = mid + 1;
                else e = mid - 1;
            }else{
                if(target > arr[mid]) e = mid - 1;
                else s = mid - 1;
            }
        }
        return -1;
    }
}
