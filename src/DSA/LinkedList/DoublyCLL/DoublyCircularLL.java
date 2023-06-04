package DSA.LinkedList.DoublyCLL;

// Doubly linked list
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyCircularLL {
    public static void main(String[] args) {
        // Creating a Doubly Circular LL
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);

        head.next  = n1;
        n1.prev = head;
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;

        n3.next = head;
        head.prev = n3;


    }
}
