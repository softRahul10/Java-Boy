package DSA.SearchingInArray;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] myNumbers = {10,20,30,40,50};
        int key = 10;
        System.out.println(key+" is present in Array : " + binarySearch(myNumbers,key,0,myNumbers.length-1));
    }

    /* Recursive Binary Search */
    public static boolean binarySearch(int[] arr, int key, int l, int h) {
        int mid = l + (h-l)/2;
        if(l>h){
            return false;
        }
        if(key == arr[mid]){
            return true;
        }
        if(key > arr[mid]) {
            return binarySearch(arr, key, mid+1,h);
        }else{
            return binarySearch(arr,key,l,mid-1);
        }

    }
}
