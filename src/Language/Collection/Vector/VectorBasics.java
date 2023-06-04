package Language.Collection.Vector;

import java.util.Vector;

public class VectorBasics {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());

        v.removeElement(1);
        System.out.println(v);

        for( int i = 1; i < 18; i++) {
            v.addElement(i);
        }

        System.out.println(v);
        System.out.println(v.capacity());

        v.removeAllElements();
        System.out.println(v);
    }
}
