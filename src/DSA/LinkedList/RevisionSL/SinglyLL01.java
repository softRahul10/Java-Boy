package DSA.LinkedList.RevisionSL;

class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}

public class SinglyLL01 {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        // Insert
        head = insertInStart(head,1);
        // Insert @ End
        head = insertInEnd(head,100);
        print2(head);

       /* head = deleteInStart(head);
        print2(head);
        head = deleteInEnd(head);
        print2(head);*/

        int result = searchRecursive(head,100);
        System.out.println("output:" + result);

        
    }

    /* Search in a linked list */
    // Iterative
    public static int searchIterative(Node head, int value) {
        int count = 1;
        while(head != null) {
            if(head.data == value) {
                return count;
            }
            count++;
            head = head.next;
        }
        return -1;
    }

    // Recursive
    // Iterative
    public static int searchRecursive(Node head, int value) {
        // Base case
        if(head == null) return -1;
        if(head.data == value) return 1;
        // Recursive case
        int res =  searchRecursive(head.next, value);
        if(res == -1) return -1;
        return (res+1);
    }

    /*
    * Insert @ given position
    * */
    public static Node insertAtPos(Node head, int pos, int value) {
        // Create Node
        Node newNode = new Node(value);

        // if pos == 1 [ Insert @ Beginning ]
        if(pos == 1) {
            newNode.next = head;
            return newNode;
        }
        // Find pos
        Node temp = head;
        int i = 1;
        while(i <= pos-2 && temp != null) {
            temp = temp.next;
            i++;
        }
        if(temp == null) {
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
    /*
    * Delete Operation
    * */

    // Delete @ End
    public static Node deleteInEnd(Node head) {
        // Edge Case ( if node < 2 )
        if(head == null || head.next == null)
            return null;
        // Logic ( node >= 2 )
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Delete @ Start
    public static Node deleteInStart(Node head) {
        if(head == null)
            return null;
        return head.next;
    }

    /**
     * Insert Operation
    * */

    // Insert @ End
    public static Node insertInEnd(Node head, int data) {
        // Create -> New node
        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
        }
        // Find Last Node
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        // Just add -> new Node
        // lastNode.next = newNode
        temp.next = newNode;
        return head;
    }

    // Insert @ Beginning
   // 1. Create a new node
    // 2. newNode.next = head;
    // 3. Return newNode
    public static Node insertInStart(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    // Print LL
    public static void print1(Node head) {
        // if(head == null) return; ----> No Need of this line
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    // Print LL (Recursive)
    public static void print2(Node head) {
        // Base Case
        if(head == null) {
            System.out.println();
            return;
        }

        // Recursive Case
        System.out.print(head.data + " -> ");
        print2(head.next); // Tail Call elimination
    }
}

