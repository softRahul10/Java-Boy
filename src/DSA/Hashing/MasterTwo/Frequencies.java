package DSA.Hashing.MasterTwo;

import java.util.HashMap;
import java.util.Map;

public class Frequencies {
    public static void main(String[] args) {
        int[] arr = new int[]{10,12,10,15,10,20,12,12};
        printFrequencies(arr);
    }
    public static void printFrequencies(int[] array) {
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(hm.containsKey(array[i])) {
                hm.put(array[i],hm.get(array[i]) + 1);
            }else{
                hm.put(array[i],1);
            }
        }
        hm.forEach((key,value)->{
            System.out.println(" " + key + " : " + value);
        });
    }
}
