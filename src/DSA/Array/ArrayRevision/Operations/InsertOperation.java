package DSA.Array.ArrayRevision.Operations;

import java.util.Arrays;

public class InsertOperation {
    public static void main(String[] args) {
        char[] ch = new char[10];
        ch[0] = 'a';
        ch[1] = 'e';
        ch[2] = 'i';
        ch[3] = 'o';
        ch[4] = 'u';
        System.out.println(" Initially " + Arrays.toString(ch));
        int newN = insertInArray(ch,5,'x',2);
        newN = insertInArray(ch,newN,'z',1);
        System.out.println(" Initially " + Arrays.toString(ch));
    }
    // Insert in a fix size array
    public static int insertInArray(char[] arr, int n, char value, int pos) {
        // Check 1: Array is full
        if(n == arr.length) {
            return n;
        }
        int id = pos - 1;
        for (int i = n-1; i >= id; i--) {
            arr[i+1] = arr[i];
        }
        arr[id] = value;
        return (n+1);
    }
}
