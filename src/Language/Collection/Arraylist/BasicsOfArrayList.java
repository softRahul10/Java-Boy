package Language.Collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        /* we have three ways to create Arraylist in java */
        /* no args */
        List list = new ArrayList(10);

        /* There are four ways to insert element in an ArrayList */
        /* 1. (insert @ end) */
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       // System.out.println(list);

        /* 2. insert @ Given Index */
        list.add(0,100);
        //System.out.println(list);

        /* 3. insert a list @ the end */
        List<String> strList = new ArrayList<>();
        strList.add("One");
        strList.add("Two");
        strList.add("Three");
        strList.add("Four");


        list.addAll(strList);

        System.out.println(list);
        System.out.println(strList);

        /* 4. insert a collection @ anywhere */
        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);

        System.out.println(list2);
        list.addAll(2,list2);

        System.out.println(list);


        /* Fetching elements */
        List<Character> listChar = new ArrayList<>();
        listChar.add('a');
        listChar.add('b');
        listChar.add('c');
        System.out.println(listChar.get(2));








        /* initial capacity */
       // List list2 = new ArrayList(100);

        /* old arraylist */
        // List list3 = new ArrayList(list2);

    }
}
