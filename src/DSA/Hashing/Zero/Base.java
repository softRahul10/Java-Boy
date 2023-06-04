package DSA.Hashing.Zero;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Base {
    public static void main(String[] args) {
       // creation
       Set<Integer> h = new HashSet<>();

       // adding data
        for(int i=1; i<=10; i++) {
            h.add(i);
        }
        System.out.println(h);

        // Iterator
        Iterator it = h.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
