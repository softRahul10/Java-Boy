package DSA.Array.Questions.IMP;

public class FindLargestElementInArray {
    public static void main(String[] args) {
        System.out.println(largestInArray(new int[]{1,2,4,8,9,22,0,6}));
    }

    // Largest element in array
    // Naive
    public static int largestInArray(int[] arr) {
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[result]) {
                result = i;
            }
        }

        return result;
    }
}
