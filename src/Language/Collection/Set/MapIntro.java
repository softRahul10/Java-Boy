package Language.Collection.Set;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
        // Map
        Map<String,String> s = new HashMap<>(); // Same as HashSet
        // Insertion
        s.put("RN-01","Rahul Keshri");
        s.put("RN-02","Gautam Keshri");
        s.putIfAbsent("RN-02","GK");

        // Remove
        System.out.println(s.remove("RN-02"));
        System.out.println(s.remove("RN-02","RK"));

        // Replace
        System.out.println(s.replace("RN-01","RK","Rahul Kumar keshri"));
        System.out.println(s.replace("RN-03","Aakash Keshri"));

        // Getting
        System.out.println(s.get("RN-01")); // value:Rahul Keshri
        System.out.println(s.get("RN-11")); // null return

        System.out.println(s.getOrDefault("RN-01","I am Principle!"));
        System.out.println(s.getOrDefault("RN-10","I am Principle!"));
        System.out.println(s);




    }
}
