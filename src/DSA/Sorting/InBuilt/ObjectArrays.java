package DSA.Sorting.InBuilt;

import java.util.Arrays;

public class ObjectArrays {
    public static void main(String[] args) {
        Point[] objArray = new Point[4];
        objArray[0] = new Point(10,1);
        objArray[1] = new Point(5,2);
        objArray[2] = new Point(1,11);
        objArray[3] = new Point(8,6);

        System.out.println("Object Array Before Sorting : ");
        for( int i=0; i < objArray.length; i++ ) {
            System.out.print(" { " + objArray[i].x + "," + objArray[i].y + " } ");
        }
        System.out.println();
        Arrays.sort(objArray);
        System.out.println("Object Array After Sorting : ");
        for( int i=0; i < objArray.length; i++ ) {
            System.out.print(" { " + objArray[i].x + "," + objArray[i].y + " } ");
        }

    }
}

/* This is a user defined data type */
class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point obj) {
        return this.x - obj.x;
    }
}
