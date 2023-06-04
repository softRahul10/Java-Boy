package Language.Collection.Arraylist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class RandomAccessInterface {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof Cloneable);
        System.out.println(l instanceof ArrayList);
        System.out.println(l instanceof RandomAccess);

        LinkedList l2 = new LinkedList();
        System.out.println(l2 instanceof Serializable);
        System.out.println(l2 instanceof Cloneable);
        System.out.println(l2 instanceof LinkedList);
        System.out.println(l2 instanceof RandomAccess);

    }
}
