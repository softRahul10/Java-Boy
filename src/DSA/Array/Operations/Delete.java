package DSA.Array.Operations;

import java.util.Arrays;

public class Delete {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4};
        System.out.println("Array Before Deletion : " + Arrays.toString(numbers));
        delete(numbers,numbers.length, numbers.length, 4);
        System.out.println("Array After Deletion : " + Arrays.toString(numbers));

    }
    /* Delete Operation in Array */
    public static int delete(int[] array, int size, int capacity, int key){
        /* Delete at end in O(1) Time */
        if(key == array[size-1]){
            return (size - 1);
        }
        /* 1. Firstly, search for key in Array */
        int i = 0;
        for(; i<capacity; i++){
            if(array[i] == key){
               break;
            }
        }
        if(i == capacity){
            return size;
        }
        /* 2. shift elements, one index before */
        for(int j = i; j < capacity - 1; j++){
            array[j] = array[j+1];
        }

        return (size - 1);
    }

}
