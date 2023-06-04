package DSA.BinarySearch.Questions;

public class FindLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(findLast(arr,1,0,(arr.length - 1)));
    }

    // find last occurrence : Recursive
    public static int findLast(int[] arr, int target,int l, int h) {
       // Base Case
        if(l > h) return -1;

       // Recursive Case
        while(l <= h) {
            int mid = l + (h-l)/2;
            if(arr[mid] > target) {
               return findLast(arr,target,l,(mid-1));
            }else if(arr[mid] < target) {
                return findLast(arr,target,(mid+1),h);
            }else {
                if(mid == (arr.length -1) || arr[mid] != arr[mid+1]) {
                    return mid;
                }else{
                    return findLast(arr,target,(mid+1),h);
                }
            }
        }
        return -1;
    }

    // find last occurrence : Iterative
    public static int findLast(int[] arr, int target) {
        int l = 0;
        int h = arr.length - 1;
        while(l <= h) {
            int mid = l + (h-l)/2;
            if(arr[mid] > target) {
                h = mid - 1;
            }else if(arr[mid] < target) {
                l = mid + 1;
            }else {
                if(mid == (arr.length -1) || arr[mid] != arr[mid+1]) {
                    return mid;
                }else{
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
