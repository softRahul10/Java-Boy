package Language.Collection.Set;

import java.util.*;

public class HashSetIntro {
    public static void main(String[] args) {

        Set<Integer> hs = new HashSet<>();

        Set<Integer> hs2 = new HashSet<>();
        hs2.add(99);
        hs2.add(1);
        hs2.add(81);
        hs2.add(3);
        hs2.add(100);

        System.out.println("Before Sorting " + hs2);

        ArrayList<Integer> al = new ArrayList<>(hs2);
        Collections.sort(al);
        System.out.println("After Sorting " + al);


        // adding elements
        hs.add(10);
        hs.add(20);
        System.out.println(hs);

        // Search
        System.out.println("Does my HashSet contain 10 : " + hs.contains(10));
        System.out.println("Does my HashSet contain 999 : " + hs.contains(999));

        // Delete
        hs.add(11);
        hs.add(12);
        hs.remove(11);
        System.out.println(hs);
        hs.clear();
        System.out.println(hs);
        if(hs.isEmpty()) {
            hs.add(1);
            hs.add(2);
            hs.add(3);
            // Traversal of HashSet
            // 1. using for loop
            for(int val: hs) {
                System.out.println("Value is " + val);
            }
            // 2. using Iterator
            Iterator<Integer> iterator = hs.iterator();
            while(iterator.hasNext()) {
                System.out.println("Value: " + iterator.next());
            }
            // 3. using forEach
            hs.forEach(System.out::println);
            System.out.println("Size of HashSet is : " + hs.size());
        }

    }
}


