package Test;

public class Main {
    public static void main(String[] args) {

    }
    public static int oddSum(int[] arr, int n) {
        int sum = 0;
        int numberOfOperations = 0;
        boolean isOddPresent = false;
        int indexOfOdd = -1;

        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0) {
                isOddPresent = true;
                indexOfOdd = i;
            }
            sum += arr[i];
        }

        if(sum % 2 != 0) {
            return numberOfOperations;
        }
        if(isOddPresent) {
            return ++numberOfOperations;
        }






        return numberOfOperations;
    }
}
