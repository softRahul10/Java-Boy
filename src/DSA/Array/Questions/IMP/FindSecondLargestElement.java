package DSA.Array.Questions.IMP;
import DSA.Array.Questions.IMP.FindLargestElementInArray;
public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] bigNumbers = {10,10,10};
        System.out.println(isSorted(bigNumbers));
    }


    // Check if Array is sorted or not in ascending order
    public static boolean isSorted(int[] arr) {
        if(arr.length == 0) return false;
        if(arr.length == 1) return true;

        int p1 = 0;
        int p2 = 1;
        while(p2 < arr.length) {
            if(arr[p2] < arr[p1]) {
                return false;
            }
            p1++;
            p2++;
        }

        return true;
    }


    // Efficient Approach
    public static int findSecondLargest2(int[] arr) {
        int res = -1;
        int largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            }else if(res == 1 || arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }

    // Find Second-largest element in an Array
    // Naive
    public static int findSecondLargest(int[] arr) {
        // first : find largest-element in an Array
        int largest = FindLargestElementInArray.largestInArray(arr);

        // Second : find second-largest Element
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[largest]) {
                if(res == -1) {
                    res = i;
                }else if(arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }
}
