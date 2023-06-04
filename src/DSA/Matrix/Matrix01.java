package DSA.Matrix;

public class Matrix01 {
    public static void main(String[] args) {
        // Matrix Creation
        int[][] arr = {
                {1},
                {2},
                {3},
                {4}
        };
        printOnly(arr);
        //printSnakePattern(arr);
    }


    // Print Matrix's Boundary elements
    public static void printOnly(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i == 0) {
                // first row
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
            }else if(i == (arr.length - 1)) {
                // last row
                for (int j = arr[i].length-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }else{
                System.out.print(arr[i][arr[i].length - 1] + ", ");
            }
        }
        for (int i = arr.length - 2; i >= 1 ; --i) {
            System.out.print(arr[i][0] + ", ");
        }
    }

    // Print Matrix in 🐍🐍🐍 Pattern
    public static void printSnakePattern(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0) {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " , ");
                }
            }else {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " , ");
                }
            }
        }
    }
}
