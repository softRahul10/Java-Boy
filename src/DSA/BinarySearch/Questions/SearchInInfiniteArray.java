package DSA.BinarySearch.Questions;
import DSA.BinarySearch.BinarySearch01;
public class SearchInInfiniteArray {
    public static void main(String[] args) {
        // Let's say
        // I have a sorted array of infinite size
        int[] bigArray = {1,2,3,4,8,12,14,18,22,28,30,40,100,200,300,400,600,800,1000,0,0,0,0};
        int o = search(bigArray,100);
        System.out.println(o);
    }
    // Unbounded Binary Search
    public static int search(int[] arr, int x) {
        // Main logic is here
        // find : last index that is greater than x
        // and use that index as high in binary search
        if(arr[0] == x) return 0;
        int i = 1;
        while (arr[i] < x) {
            i = i*2;
            if(arr[i] == x) return i;
        }
        // now apply binary search
        return BinarySearch01.binarySearch2(arr,x,(i/2+1),i-1);
    }
}
