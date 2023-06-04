package DSA.Hashing.MasterTwo;

import java.util.Arrays;

class Hash{
    private int[] table;
    private int calculateHash(int key) {
        return key % this.table.length;
    }

    public Hash(int size) {
        this.table = new int[size];
        Arrays.fill(this.table,-1);
    }

    // Insert
    public void insert(int key) {
        int idx = this.calculateHash(key);
        if(this.table[idx] == -1) {
            this.table[idx] = key;
            return;
        }
        while(this.table[idx] != -1) {
            if(idx == this.table.length - 1) {
                idx = 0;
            }else{
                idx++;
            }
        }
        this.table[idx] = key;
    }

    // Search
    public boolean search(int key) {
        int idx = this.calculateHash(key);
        int start = idx;
        if(this.table[idx] == key) {
            return true;
        }
        do{
            if(idx == this.table.length - 1) {
                idx = 0;
            }else{
                idx++;
            }
            if(this.table[idx] == key) {
                return true;
            }
            if(this.table[idx] == -1) {
                return false;
            }
        } while(start != idx);

        return false;
    }

    // Delete
    public void delete(int key) {
        int idx = this.calculateHash(key);
        if(!this.search(key)) {
            return;
        }
        while(this.table[idx] != key) {
            if(idx == this.table.length - 1) {
                idx = 0;
            }else{
                idx++;
            }
        }
        this.table[idx] = -2;
    }

    // print
    public void printTable() {
        System.out.print("[ ");
        for(int i=0; i < this.table.length; i++) {
            System.out.print(" " + this.table[i] + " ");
        }
        System.out.print(" ]");
        System.out.println();
    }

}

public class OpenAddressing {
    public static void main(String[] args) {
        int[] keys = {50,21,58,17,15,49,56};
        Hash demo = new Hash(7);
        demo.printTable();

        for(int key:keys) {
            demo.insert(key);
        }
        demo.printTable();

        System.out.println(demo.search(21));
        demo.delete(56);
        demo.printTable();
        System.out.println(demo.search(56));


    }
}
