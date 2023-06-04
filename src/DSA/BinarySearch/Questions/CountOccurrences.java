package DSA.BinarySearch.Questions;
import DSA.BinarySearch.Questions.*;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] values = {10,10,10,10,10,10};
        System.out.println(findAll(values,10));
    }

    // Count Occurrence of an element in sorted array using binary search
    public static int findAll(int[] arr, int target) {
        int firstIndex = FindFirstOccurrence.findFirst(arr,target);
        if(firstIndex == -1) {
            return 0;
        }
        int lastIndex = FindLastOccurrence.findLast(arr,target);
        return (lastIndex - firstIndex+1);
    }
}
