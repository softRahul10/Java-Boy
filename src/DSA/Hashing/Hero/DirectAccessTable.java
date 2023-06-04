package DSA.Hashing.Hero;

public class DirectAccessTable {
    public static void main(String[] args) {
        Table myTable = new Table();
        myTable.insert(10);
        myTable.insert(20);
        myTable.insert(119);
        myTable.search(10);
        myTable.search(20);

        myTable.delete(119);
        myTable.search(119);
    }
}

/* Direct access Table */
class Table{
    private final int[] arr;
    Table() {
        arr = new int[1000];
    }
    /* Insert */
    public void insert(int key) {
        arr[key] = 1;
    }

    /* Search */
    public void search(int key) {
        if(arr[key] == 1) {
            System.out.println("Found!");
        }else{
            System.out.println("not found!");
        }
    }

    /* Delete */
    public void delete(int key) {
        arr[key] = 0;
    }
}