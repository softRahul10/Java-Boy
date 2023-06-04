package DSA.Hashing.MasterTwo;

import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args) {
        System.out.println(count(new int[]{}));
        System.out.println(count(new int[]{1,11,2,2,3,3,4,10}));
    }

    public static int count(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int ele:arr) {
            hs.add(ele);
        }
        return hs.size();
    }
}
