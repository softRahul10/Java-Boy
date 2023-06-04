package Language.ArrayFn;

public class PrintTwice {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] arr2 = new int[10000];
        printTwoArray(arr,arr2);
    }

    public static void printTwoArray(int[] arr1, int[] arr2) {
        for(int ele:arr1) {
            System.out.print(ele);
        }
        for(int ele:arr2) {
            System.out.print(ele);
        } // Time complexity = O(n+m);
    }



    public static void printArray(int[] arr) {
        System.out.println(1);
        for(int data:arr) {
            System.out.print(data+" ");
        }

        System.out.println("\n" + 2);
        for(int data: arr) {
            System.out.print(data + " ");
        }

    }
}
