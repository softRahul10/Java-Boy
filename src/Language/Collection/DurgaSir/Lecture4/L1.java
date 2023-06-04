package Language.Collection.DurgaSir.Lecture4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class L1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        LinkedList list = new LinkedList();

        System.out.println(al instanceof Serializable);
        System.out.println(al instanceof Cloneable);
        System.out.println(al instanceof RandomAccess);

        System.out.println(list instanceof Serializable);
        System.out.println(list instanceof Cloneable);
        System.out.println(list instanceof RandomAccess);
    }
}
