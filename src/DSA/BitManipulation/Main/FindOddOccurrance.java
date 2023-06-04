package DSA.BitManipulation.Main;

public class FindOddOccurrance {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,4,4,6,6,6,9,9};
        System.out.println(findOdd(nums));
    }
    public static int findOdd(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            n = n ^ arr[i];
        }
        return n;
    }
}
