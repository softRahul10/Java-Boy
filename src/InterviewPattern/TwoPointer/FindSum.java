package InterviewPattern.TwoPointer;

import java.util.Arrays;

public class FindSum {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 9, 11};
        int target = 40;
        System.out.println(Arrays.toString(findSum(numbers,target)));
    }

   public static int[] findSum(int[] arr, int sum) {
        int p1 = 0;
        int p2 = arr.length - 1;
        int[] indices = new int[2];
        while(p1 < p2) {
            int total = arr[p1] + arr[p2];
            if(total == sum) {
                indices[0] = p1;
                indices[1] = p2;
                break;
            }else if(total>sum) {
                p2 = p2 - 1;
            }else{
                p1 = p1 + 1;
            }
        }
        return indices;
    }
}
