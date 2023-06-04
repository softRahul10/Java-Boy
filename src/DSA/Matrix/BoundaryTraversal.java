package DSA.Matrix;

public class BoundaryTraversal {

    public static void main(String[] args) {
        // Matrix
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {4,3,2,1},
                {8,7,6,5}
        };

        print(arr);
    }

    public static void print(int[][] matrix) {
        // print:Top row
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[0][i] + " ");
        }

        // Last col
        for (int i = 1; i < matrix.length; i++) {
            System.out.println(matrix[i][matrix[i].length - 1]);
        }

        // print: Bottom row
        for (int i = matrix[3].length-2; i >= 0 ; i--) {
            System.out.print(matrix[3][i] + " ");
        }

        // first col
        for (int i = 1; i < matrix.length - 1; i++) {
            System.out.println(matrix[i][0]);
        }
    }
}
