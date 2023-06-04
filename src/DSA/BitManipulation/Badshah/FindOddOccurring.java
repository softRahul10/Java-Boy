package DSA.BitManipulation.Badshah;

public class FindOddOccurring {
    public static void main(String[] args) {
        System.out.println(findOdd(new int[]{9,8,8,4,4,3,9,11,11,9,9}));
        System.out.println(findMissingNumber(new int[]{1,3,4}));
    }
    public static int findOdd(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static int findMissingNumber(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        for (int i = 1; i <= arr.length + 1; i++) {
            result = result ^ i;
        }
        return result;
    }
}
