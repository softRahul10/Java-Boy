package DSA.BinarySearch.Questions;
import DSA.BinarySearch.Questions.*;

public class CountOneInBinaryArray {
    public static void main(String[] args) {
        System.out.println(countOneTwo(new int[]{1,1,1,1,1,1,1,1,0}));
    }

    // sir's solution
    public static int count1(int[] arr) {
       return 0;
    }

    // Count 1's in a sorted Binary Array
    public static int countOne(int[] arr) {
        int firstIndex = FindFirstOccurrence.findFirst(arr,1);
        if(firstIndex == -1) {
            return 0;
        }
        int lastIndex = FindLastOccurrence.findLast(arr,1);
        return (lastIndex - firstIndex + 1);
    }

    // Solution 2
    public static int countOneTwo(int[] array) {
        int count = 0;
        if(array[0] == 0) {
            for (int i = array.length-1; i >= 0 ; i--) {
                if(array[i] == 1) count++;
                else {
                    break;
                }
            }
        }else{
            for (int i = 0; i < array.length; i++) {
                if(array[i] == 1) count++;
                else{
                    break;
                }
            }
        }
        return count;
    }

    // Solution 3
    public static int countOneThree(int[] arr) {
        int res = 0;
        if(arr[0] == 0) {
            int firstIndex = FindFirstOccurrence.findFirst(arr,1);
            res = (arr.length - 1) - firstIndex + 1;
        }else{
            int lastIndex = FindLastOccurrence.findLast(arr,1);
            res = lastIndex + 1;
        }
        return res;
    }
}
