package Language.Collection.DurgaSir;

import java.util.ArrayList;
import java.util.List;

public class Lecture2 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        List<Float> floatArray = new ArrayList<>();

        // Methods of Collection Interface
        array.add(100);
        array.add(1);

        for (int i = 1; i <= 10 ; i++) {
            array2.add(i);
        }

      /*  floatArray.add(2.2f);
        floatArray.add(4.4f);
        floatArray.add(6.6f);
        floatArray.add(8.8f);*/

        System.out.println(array);
        System.out.println(array2);


        //array.addAll(floatArray);

    }
}
