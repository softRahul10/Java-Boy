package CrackingGoogle.SlidingWindow;
import java.util.*;

public class Intro {
    public static void main(String[] args) {
        double[] arr = new double[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
        System.out.println(Arrays.toString(calculateAverage(arr,5)));
        System.out.println(Arrays.toString(calculateAverage2(arr,5)));
    }
    // Calculate Average of Sub array of size 5
    // Brute force
    public static double[] calculateAverage(double[] arr, int k) {
        double[] result = new double[arr.length - k + 1];
        for (int i = 0; i <= arr.length - k; i++) {
            double sum = 0;
            for (int j = i; j < i+k; j++) {
                sum = sum + arr[j];
            }
            result[i] = sum / k;
        }
        return result;
    }

    // Efficient Solution
    // Sliding Window Pattern
    public static double[] calculateAverage2(double[] arr, int k) {
        // Creating Array
        double[] result = new double[arr.length - k + 1];
        double sum = 0;

        int start = 0;
        for (int end = 0; end < arr.length; end++) {

            sum = sum + arr[end];
            if(end >= k-1) {
                result[start] = sum / k;
                sum = sum - arr[start];
                start++;
            }

        }

        return result;


    }
}
