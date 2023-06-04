package DSA.Array.Questions;

public class Maximum1 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,1,0,1,1};
        System.out.println(maximumConsecutiveOne2(arr));
    }

    public static int maximumConsecutiveOne(int[] arr) {
        int maxAppear = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1 && i == arr.length-1) {
                count++;
                maxAppear = Math.max(maxAppear,count);
            }else if(arr[i] == 1) {
                count++;
            }else if(arr[i] == 0 || i == arr.length-1) {
                maxAppear  = Math.max(maxAppear,count);
                count = 0;
            }
        }
        return maxAppear;
    }

    // Sandeep Sir's amazing 🤩 logic
    public static int maximumConsecutiveOne2(int[] arr) {
        int maxAppear = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count = 0;
            }else{
                count++;
                maxAppear = Math.max(count,maxAppear);
            }
        }
        return maxAppear;
    }
}
