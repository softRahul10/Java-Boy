package InterviewPattern.SlidingWindow;

public class Ex2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int maxNumber = findMaxInSubArray2(array,3);
        System.out.println("Max in Sub Array : " + maxNumber);
    }

    /* Sliding window */
    public static int findMaxInSubArray2(int[] arr, int k) {
        int[] result = new int[arr.length - k + 1];
        int windowStart = 0;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if(windowEnd >= k-1) {
                result[windowStart] = windowSum;
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }
        }

        int max = 0;
        for (int i = 0; i < result.length; i++) {
            if(result[i]>max) {
                max = result[i];
            }
        }

        return max;

    }

    public static int findMaxInSubArray(int[] array, int k) {
        int[] result = new int[array.length - k + 1];

        for (int i = 0; i < result.length; i++) {
            int sum = 0;
            for (int j = i; j < k+i; j++) {
                sum = sum + array[j];
            }
            result[i] = sum;
        }

        // find max
        int max = 0;
        for (int i = 0; i < result.length; i++) {
            if(result[i]>max) {
                max = result[i];
            }
        }

        return max;
    }
}
