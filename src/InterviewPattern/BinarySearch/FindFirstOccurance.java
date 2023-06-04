package InterviewPattern.BinarySearch;

public class FindFirstOccurance {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,10,10,10,10,10,10,10,100};
        int key = 10;
        int result = ffOccurrence(data,key,0,data.length-1);
        System.out.println("First Occurrence of " + key + " is : " + result);
        System.out.println("last Occurrence of " + key + " is : " + findLastOccurrence(data,key,0,data.length-1));
    }

    /* Find First Occurrence */
    public static int ffOccurrence(int[] arr, int key, int s, int e) {
        // Base case
        if(s > e) {
            return -1;
        }
        int mid = s + (e - s)/2;
        if(key > arr[mid]) {
            return ffOccurrence(arr,key,mid+1,e);
        }else if(key < arr[mid]) {
            return ffOccurrence(arr,key,s,mid-1);
        }else{
            if(mid == 0 || arr[mid-1] != arr[mid]) {
                return mid;
            }else{
                return ffOccurrence(arr,key,s,mid-1);
            }
        }

    }

    /* Find Last Occurrence */
    public static int findLastOccurrence(int[] arr, int key, int s, int e) {
        // Base case
        if(s > e) {
            return -1;
        }
        int lastIndex = arr.length - 1;
        int mid = s + (e - s)/2;
        if(key > arr[mid]) {
            return ffOccurrence(arr,key,mid+1,e);
        }else if(key < arr[mid]) {
            return ffOccurrence(arr,key,s,mid-1);
        }else{
            if(mid == lastIndex || arr[mid+1] != arr[mid]) {
                return mid;
            }else{
                return findLastOccurrence(arr,key,mid+1,e);
            }
        }

    }
}
