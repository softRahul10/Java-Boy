package DSA.Hashing.Master;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {
    public static void main(String[] args) {
        MyHash obj1 = new MyHash(7);
        obj1.insert(42);
        obj1.insert(66);
        obj1.insert(53);
        obj1.insert(11);
        obj1.insert(99);
        System.out.println(obj1.print());
    }
}

// Class for handling Collision: Chaining Method
class MyHash{

    // Array of Linked list for chaining
    private int size;
    private ArrayList<LinkedList<Integer>> al;

    public MyHash(int size) {
        this.size = size;
        al = new ArrayList<LinkedList<Integer>>();
        // Creating linked list

        for (int i = 0; i < this.size; i++) {
            al.add(new LinkedList<Integer>());
        }

    }

    // Hash function
    private int calculateHash(int value) {
        return (value % this.size);
    }

    // Insert Operation
    public void insert(int value) {
        int idx = calculateHash(value);
        al.get(idx).add(value);
    }

    // Search Operation
    public boolean search(int value) {
        int idx = calculateHash(value);
        return al.get(idx).contains(value);
    }

    // Delete Operation
    public void delete(int value) {
        int idx = calculateHash(value);
        al.get(idx).remove((Integer) value);
    }

    // Print
    public String print() {
        return al.toString();
    }

 }