package DSA.Array.Questions;

public class FrequenciesInArray {
    public static void main(String[] args) {
        int[] array = {1,2,2,2,2,4,8,12,12,12,12,12,12,12,100,123,123,200,230,250,1000};
        printFreq(array);
    }

    // print frequencies of elements in a Sorted Array
    public static void printFreq(int[] nums) {
        if(nums.length == 0) return;

        int curr = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == curr) {
                count++;
            }else{
                System.out.println(curr + " [" + count + "] ");
                curr = nums[i];
                count = 1;
            }
        }

        // print last element
        System.out.println(curr + " [" + count + "] ");
    }
}
