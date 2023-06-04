package Language.ArrayFn;

public class ArrayBasics {
    public static void main(String[] args) {
        // Array Declaration
        int[] i;

        // Array Creation
        i = new int[4];

        // Array Initialization
        i[0] = 100;
        i[1] = 200;
        i[2] = 300;
        i[3] = 400;

        // Array Declaration, Creation and Initialization all in just one
        // Line
        int[] i2 = {100,200,300,400};


        /* Multidimensional Array */

        // Declaration
        int[][] r;

        // Creation
        r = new int[2][2];

        // Initialization
        r[0][0] = 1;
        r[0][1] = 2;

        r[1][0] = 3;
        r[1][1] = 4;

        // Multi Dimensional Array Declaration, Creation and Initialization all in  just one Line
        int[][] r2 = {{1,2},{3,4}};

        /* Anonymous Array in java */
        System.out.println(new int[]{1,2,3,4,5}.length);
        System.out.println(new int[100].length);


        /* Array value initialization */
        int[] arrayOne = new int[5];
        byte b = 1;
        arrayOne[0] = b;
        short s = 2;
        arrayOne[1] = s;
        char c = 'a';
        arrayOne[2] = c;
        int n = 3;
        arrayOne[3] = n;
        boolean b2 = false;
        arrayOne[4] = 0;
        for(int data: arrayOne){
            System.out.println(data);
        }
    }
}
