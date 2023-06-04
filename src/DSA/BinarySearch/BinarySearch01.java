package DSA.BinarySearch;

public class BinarySearch01 {
    public static void main(String[] args) {
        int[] myBeautifulNumbers = {10,20,30,40,50,60,70,80};
        System.out.println(binarySearch2(myBeautifulNumbers,50,0,myBeautifulNumbers.length - 1));
    }

    // Binary Search algo: Recursive
    public static int binarySearch2(int[] arr, int target,int s, int e) {
        // Base Case
        if(s > e) {
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target) {
            return mid;
        }else if(arr[mid] > target) {
           return binarySearch2(arr,target,s, mid-1);
        }else {
            return binarySearch2(arr,target,mid+1,e);
        }



        // Recursive Case
    }

    // Binary Search algo : Iterative
    public static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s)/2;
            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] > target) {
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }

        return  -1;
    }


}
