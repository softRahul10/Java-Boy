package DSA.Array.Operations;

public class Search {
    public static void main(String[] args) {
        int[] ages = new int[]{2,4,6,8,10,12,14,20,30,60};
        int indexOfKey = binarySearch(ages,0);
        System.out.println("Index of 0 in array is : " + indexOfKey);

    }

    /* Linear Search */
    public static int linearSearch(int[] array, int size, int target){
        for(int i = 0; i<size; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

    /* Binary Search */
    public static int  binarySearch(int[]  data, int value){
        int p1 = 0; // first index
        int p2 = data.length - 1; // last index

        while(p1<=p2){
            int mid = (p1+p2)/2; // finding middle index
            if(value == data[mid]){
                return mid;
            }else if(value > data[mid]){
                p1 = mid + 1;
            }else{
                p2 = mid - 1;
            }

        }

        return -1;
    }
}
