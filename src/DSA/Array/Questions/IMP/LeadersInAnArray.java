package DSA.Array.Questions.IMP;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] randomNumbers = {7,4,10,8,10,9,11,8,4};
        findLeadersInArray2(randomNumbers);
    }


    // Efficient Solution
    public static void findLeadersInArray2(int[] arr) {
        int curr_Leader = arr[arr.length - 1];
        System.out.print(curr_Leader);

        for (int i = arr.length - 2; i >= 0 ; i--) {
            if(curr_Leader < arr[i]) {
                curr_Leader = arr[i];
                System.out.print(curr_Leader);
            }
        }
    }

    // Leaders in An Array
    public static void findLeadersInArray(int[] arr) {
        boolean isLeader;
        for (int i = 0; i < arr.length; i++) {
            isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if(isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
