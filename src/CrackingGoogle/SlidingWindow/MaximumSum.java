package CrackingGoogle.SlidingWindow;

public class MaximumSum {
    public static void main(String[] args) {
        int[] dummy = new int[]{2, 3, 4, 1, 5};
        System.out.println(maxSum(dummy,2));
        System.out.println(maxSum2(dummy,2));
    }
    // Window Sliding 1
    public static int maxSum(int[] arr, int k) {
        int max = 0;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];
            if(end >= k-1) {
                max = Math.max(max,sum);
                sum = sum - arr[start++];
            }
        }

        return max;
    }

    // Window Sliding 2
    public static int maxSum2(int[] arr, int k) {
        int sum = 0;
        // Sum of Window
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        int maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i-k];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
