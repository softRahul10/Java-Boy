package DSA.Matrix.Badshah;

public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        transposeEfficient(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" [");
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }



        /*
        int[][] result = transpose(new int[][]{{1,2,3},{5,6,7},{9,10,11}});
        for (int i = 0; i < result.length; i++) {
            System.out.print(" [");
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print(" ]");
            System.out.println();
        }
        */

    }

    // Efficient Solution
    public static void transposeEfficient(int[][] matrix) {
        // for rows
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                swap(matrix,i,j);
            }
        }
    }

    private static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    // Transpose Matrix
    public static int[][] transpose(int[][] matrix) {
        int[][] m = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                m[i][j] = matrix[j][i];
            }
        }
        return m;
    }
}
