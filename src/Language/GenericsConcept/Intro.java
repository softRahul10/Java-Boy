package Language.GenericsConcept;

import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        /* Arrays are - Type Safe */
        //ex.1
        String[] st = new String[10];
        st[0] = "Rahul";
        st[1] = "keshri";

        /* Uncomment below line - to see Type safely feature of Arrays */
        //st[2] = new Integer(10);

        /* Collections are NOT - Type safe */
        ArrayList list = new ArrayList();
        list.add("Rahul");
        list.add("Keshri");
        list.add(100);
        //System.out.println(list);

        // Problems will show in runtime
        String s1 = (String)list.get(0);
        String s2 = (String)list.get(1);
        // String s3 = (String)list.get(2); Runtime Exception

        /* ! Generics solve two problems associated with - COLLECTIONS
        * 1. Type Safety
        * 2. Type Casting
        * */
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("R");
        list2.add("K");
        // This is the Type safety ------> list2.add(10);

        String s3 = list2.get(0);
        String s4 = list2.get(1);
        // Type Casting is not required




    }
}
