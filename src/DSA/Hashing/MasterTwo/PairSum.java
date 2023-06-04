package DSA.Hashing.MasterTwo;

import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int[] nums = new int[]{11,5,6};
        System.out.println(pair2(nums,10));
    }

    // Sir's efficient solution
    public static boolean pair2(int[] arr, int sum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int value:arr) {
           if(hs.contains(sum - value)) {
               return true;
           }
           hs.add(value);
        }
        return false;
    }

    public static boolean pair(int[] arr, int sum) {
        // set creation
        HashSet<Integer> hs = new HashSet<>();
        for(int ele:arr) {
            hs.add(ele);
        }

        for (int ele:arr) {
            int temp = sum - ele;
            hs.remove(ele);
            if(hs.contains(temp)) {
                return true;
            }
            hs.add(ele);
        }
        return false;
    }
}
