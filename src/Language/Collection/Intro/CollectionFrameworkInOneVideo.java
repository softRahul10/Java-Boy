package Language.Collection.Intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionFrameworkInOneVideo {
    public static void main(String[] args) {

        /* Stack Data Structure */
        Stack<Character> s = new Stack<>();
        s.push('R');
        s.push('a');
        s.push('h');
        s.push('u');
        s.push('l');

        System.out.println("Stack :"+s);
        while(!s.empty()) {
            System.out.print(s.pop());
        }





    /*    List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0,0);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        System.out.println(list2);

        list.addAll(0,list2);
        System.out.println(list);

        ArrayList<Double> db = new ArrayList<>();
        db.add(1.1);
        db.add(2.2);*/


    }
}
