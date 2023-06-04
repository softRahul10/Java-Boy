package Questions.Array;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] newArray = shuffleArray(number,n);
       printArray(newArray);
    }

    /* My Solution */
    public static int[] shuffleArray(int[] nums, int n){
        int[] result = new int[nums.length];
        int j = 0;
        int k = n;
        for(int i = 0; i < result.length; i++){
            if(i%2 == 0){
                result[i] = nums[j++];
            }else{
                result[i] = nums[k++];
            }
        }

        return result;
    }
    public static void printArray(int[] array){
       for(int x: array){
           System.out.print(x);
       }
    }
}
