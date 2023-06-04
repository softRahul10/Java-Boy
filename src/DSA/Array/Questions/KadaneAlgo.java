package DSA.Array.Questions;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] demo  = new int[]{-5,1,-2,3,-1,2,-2};
        System.out.println(maxSum(demo));
    }
    public static int maxSum(int[] arr) {
        if(arr.length == 0) return -1;
        int max  = arr[0];
        int prev = max;
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int compoundVal  = prev + val;
            if(val > compoundVal) {
                prev = val;
            }else{
                prev += val;
            }
            if(prev > max) {
                max  = prev;
            }
        }
        return max;
    }
}
