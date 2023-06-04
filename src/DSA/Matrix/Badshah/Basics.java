package DSA.Matrix.Badshah;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int[][] table = new int[rows][cols];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter x ? ");
        int x = in.nextInt();

        outer:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(table[i][j] == x) {
                    System.out.println(" ["+i+"] ["+j+"] ");
                    break outer;
                }
            }
        }

        for (int i = 0; i < table.length; i++) {
            System.out.print(" [ ");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(" " + table[i][j] + " ");

            }
            System.out.println(" ] ");
            System.out.println();
        }
    }
}
