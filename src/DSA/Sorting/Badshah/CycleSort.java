package DSA.Sorting.Badshah;

public class CycleSort {
    // 20 40 50 10 30
    public static void cSort(int[] arr) {
        for (int cs = 0; cs < arr.length-1; cs++) {
            int item = arr[cs];
            int pos = cs;
            // find , how many elements are smaller than item
            for (int i = cs+1; i < arr.length; i++) {
                if(arr[i] < item) {
                    pos++;
                }
            }
            item = swap(arr,cs,pos);
            // if pos != cs
            while(pos != cs) {
                pos = cs;
                for (int i = cs+1; i < arr.length; i++) {
                    if(arr[i] < item) {
                        pos++;
                    }
                }
                item = swap(arr,cs,pos);
            }
        }
    }

    public static int swap(int[] data,int indexOne, int indexTwo) {
        int temp = data[indexTwo];
        data[indexTwo] = data[indexOne];
        return temp;
    }
}
