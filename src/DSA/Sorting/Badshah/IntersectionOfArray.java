package DSA.Sorting.Badshah;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3,3};
        int[] arr2 = {1,1,1,1,3,5,7};
        printCommonElements(arr1,arr2);
    }

    // Efficient Solution
    public static void printCommonElements(int[] numOne, int[] numTwo) {
        int i = 0;
        int j = 0;
        while(i < numOne.length && j < numTwo.length) {
            if(i > 0 && numOne[i] == numOne[i-1]) {
                i++;
                continue;
            }
            if(numOne[i] > numTwo[j]) {
                j++;
            }else if(numOne[i] < numTwo[j]) {
                i++;
            }else{
                System.out.println(numOne[i]);
                i++;
                j++;
            }
        }
    }
}
