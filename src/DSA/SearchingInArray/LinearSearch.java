package DSA.SearchingInArray;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        System.out.println(linearSearch(numbers,30));
    }

    /* Linear Search */
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}


