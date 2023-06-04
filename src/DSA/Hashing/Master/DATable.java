package DSA.Hashing.Master;

public class DATable {

    public static void main(String[] args) {
        Hash obj = new Hash();
        obj.insert(100);
        System.out.println(obj.search(100)); // true
        obj.delete(100);
        System.out.println(obj.search(100)); // false
    }
}

// Table
class Hash{
    private int[] table = new int[1000];

    // Insert Operation
    public void insert(int value) {
        table[value] = 1;
    }
    // Search Operation
    public boolean search(int value) {
        return table[value] == 1;
    }
    // Delete Operation
    public void delete(int value) {
        table[value] = 0;
    }
}
