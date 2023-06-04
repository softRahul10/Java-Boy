package DSA.Hashing.MasterTwo;
import java.util.HashSet;

public class ArrayUnionParty {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4};
        int[] num2 = {10,20,30,40};
        int result = distinctElements2(num1,num2);
        System.out.println("Number of Distinct Elements in both arrays are : " + result);
    }
    public static int distinctElements(int[] a, int[] b) {
        HashSet<Integer> uniqueOne = new HashSet<>();
        HashSet<Integer> uniqueTwo = new HashSet<>();

        for(int ele:a) {
            uniqueOne.add(ele);
        }

        for(int ele:b) {
            if(!uniqueOne.contains(ele)) {
                uniqueTwo.add(ele);
            }
        }
        return uniqueOne.size() + uniqueTwo.size();
    }

    // Sir's solution
    public static int distinctElements2(int[] a, int[] b) {
        HashSet<Integer> unique = new HashSet<>();

        for(int ele:a) {
            unique.add(ele);
        }

        for(int ele:b) {
           unique.add(ele);
        }
        return unique.size();
    }
}
