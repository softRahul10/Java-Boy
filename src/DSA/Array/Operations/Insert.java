package DSA.Array.Operations;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int[] sample = new int[6];
        sample[0] = 40;
        sample[1] = 3;
        sample[2] = 2;
        sample[3] = 9;
        sample[4] = 11;

        System.out.println("Before Insertion : " + Arrays.toString(sample));
        insertInArray(sample,5,1,100);
        System.out.println("After Insertion : " + Arrays.toString(sample));
    }
    /* Insert @ Fixed Size Array */
    static public int insertInArray(int[] array,int size,int index, int value){
        /* check if - Array is full */
        if(size == array.length){
            return size;
        }
        int positon = index -1;
        for(int p1 = size - 1; p1 >= positon; p1--){
            array[p1+1] = array[p1];
        }
        array[positon] = value;
        return (size+1);
    }
}
