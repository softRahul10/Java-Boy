package DSA.LinkedList.DoubleLL;

public class Basic {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);

        root1.next = temp1;
        temp1.prev = root1;
        temp1.next = temp2;
        temp2.prev = temp1;

        root1 = insertBegin(root1,0);
        root1 = insertInEnd(root1,100);
        traversInBothDirection(root1);

    }

    /* Traversing */
    public static void traversInBothDirection(Node head) {
        System.out.println("\t \t Forward: -------> \t \t ");
        while(head.next != null) {
            System.out.print(head.value+"  ");
            head = head.next;
        }
        System.out.println(head.value+" ");
        System.out.println("Backward : <-------  ");

        while (head.prev != null) {
            System.out.print(head.value + " ");
            head = head.prev;
        }
        System.out.print(head.value+" ");
    }

    /* Insert @ Begin */
    public static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        if(head == null) {
            return temp;
        }
        temp.next = head;
        head.prev = temp;
        return temp;
    }

    /* Sandeep Sir's Solution */
    public static Node insertBegin2(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if(head != null) {
            head.prev = temp;
        }
        return temp;
    }

    /* Insert @ End */
    public static Node insertInEnd(Node head, int data) {
        Node temp = new Node(data);
        if(head == null) {
           return temp;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;

        return head;
    }
}

/* class : Doubly Linked list */
class Node{
    int value;
    Node prev;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}
