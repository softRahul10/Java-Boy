package Language.Collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations1 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('S');
        list.add('K');
        list.add('Y');
        System.out.println(list);

        /* remove */
        list.remove(1);
        System.out.println("After Removing :- " +list);

        List<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('E');
        list2.add('I');
        list2.add('O');
        list2.add('U');
        System.out.println("List before Removal : " + list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);



    }
}
