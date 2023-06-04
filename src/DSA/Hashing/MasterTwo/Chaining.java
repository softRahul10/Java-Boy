package DSA.Hashing.MasterTwo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {
    public static void main(String[] args) {
        Chain c = new Chain(10);
        int[] keys = {100,11,2,4,196,0,9621,250,200,800};

        for(int key: keys) {
            c.add(key);
        }

        System.out.println(c.search(100));
        c.delete(100);
        System.out.println(c.search(100));
    }
}

class Chain{
    private int size;
    private ArrayList<LinkedList<Integer>> bucket;

    public Chain(int size) {
        this.size = size;
        bucket = new ArrayList<>();
        for(int i=0; i < this.size; i++) {
            bucket.add(new LinkedList<>());
        }
    }

    public int hashValue(int key) {
        return  key % this.size;
    }

    public void add(int key) {
        int i = hashValue(key);
        bucket.get(i).add(key);
    }

    public void delete(int key) {
        int i = hashValue(key);
        bucket.get(i).remove((Integer) key);
    }

    public boolean search(int key) {
        int i = hashValue(key);
        return bucket.get(i).contains(key);
    }
}
