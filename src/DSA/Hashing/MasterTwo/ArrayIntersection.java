package DSA.Hashing.MasterTwo;

import java.util.HashSet;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] numOne = {10,10,10};
        int[] numTwo = {10,10,10};
        System.out.println(commonElements(numOne,numTwo));
    }

    public static int commonElements(int[] a, int[] b) {
        // create a set for array - a
        HashSet<Integer> hs = new HashSet<>();
        for(int value: a) {
            hs.add(value);
        }
        int count = 0;
        for (int value:b) {
            if(hs.contains(value)) {
                count++;
                hs.remove(value);
            }
        }
        return count;
    }
}
