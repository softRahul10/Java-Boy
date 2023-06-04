package DSA.LinkedList.RevisionDLL;
// class : Double LikedList
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class DoublyLL01 {
    public static void main(String[] args) {
        // Creating Doubly Linked list
        Node head = new Node(10); // [null, 10 , null]
        Node n1 = new Node(20); // [null, 20, null]
        Node n2 = new Node(30); // [null, 30, null]

        head.next = n1;
        n1.prev = head;
        n1.next = n2;
        n2.prev = n1;

        //traversal(head);
        head  = insertBegin(head,1);
        //traversal(head);
        head = insertEnd(head,41);
        //traversal(head);

        traversal(head);
        head = deleteBegin(head);
        traversal(head);
        head = deleteEnd(head);
        head = deleteEnd(head);
        traversal(head);


    }

    // Reversal of Doubly Linked List
    private static Node reverse(Node head) {
        // Edge case
        if(head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }

        return prev.prev;


    }

    // Delete @ End
    private static Node  deleteEnd(Node head) {
        if(head == null || head.next == null) {
            return null;
        }

        // Access Last Node
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        // Access 2nd last node using last node's prev pointer
        curr.prev.next = null;
        curr.prev = null;
        return head;
    }

    // Delete @ Start
    private static Node deleteBegin(Node head) {
        if(head == null || head.next == null) {
            return null;
        }
        Node temp = head.next;
        temp.prev = null;
        return temp;
    }

    // Insert @ End
    private static Node insertEnd(Node head, int data) {
        Node temp = new Node(data);
        if(head == null) return temp;

        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }

        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    // Insert @ Begin
    private static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        if(head == null) return temp;
        temp.next = head;
        head.prev = temp;

        return temp;
    }

    private static Node insertBeginSir(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if(head != null) {
            head.prev = temp;
        }
        return temp;
    }



    // Traversal of Doubly Linked list
    private static void traversal(Node head) {
        while (head != null) {
            System.out.print(head.data + " ➡ ");
            head = head.next;
        }
        System.out.println();
    }
}
