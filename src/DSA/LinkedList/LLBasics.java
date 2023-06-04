package DSA.LinkedList;

public class LLBasics {
    public static void main(String[] args) {
        Node head = null;
        head = insertAtStart2(head,30);
        head = insertAtStart2(head,20);
        head = insertAtStart2(head,10);

        //traversLL(head);

        /* insert at end */
        Node head2 = null;
        head2 = insertAtEnd(head2,1);
        head2 = insertAtEnd(head2,2);
        head2 = insertAtEnd(head2,3);
        head2 = insertAtEnd(head2,4);
        //traversLL(head2);

        Node head3 = null;
        head3 = insertAtStart(head3,300);
        head3 = insertAtStart(head3,200);
        head3 = insertAtStart(head3,100);
        System.out.println(" Linked List before Deletion : ");
        traversLL(head3);
        head3 = deleteFirstNode(head3);
        System.out.println("Linked List after Deletion : ");
        traversLL(head3);

        head3 = deleteFirstNode(head3);
        System.out.println("Linked List after 2nd Deletion : ");
        traversLL(head3);

        head3 = deleteFirstNode(head3);
        System.out.println("Linked List after 3rd Deletion : ");
        traversLL(head3);

    }

    /* Traversing of a singly Linked List */
    public static void traversLL(Node temp) {
        if (temp == null) {
            System.out.println("Linked List is empty!");
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /* Traversing of a Singly Linked List (Recursive solution) */
    static public void printLL2(Node head) {
        Node temp = head;
        /* Base case*/
        if (temp == null)
            return;
        /* Recursive case */
        System.out.println(temp.data);
        printLL2((temp = temp.next));
    }

    /* Insert at (Beginning) */
    public static Node insertAtStart(Node head, int data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        return head;

    }

    /* Insert at (Beginning) - Sandeep Sir's Solution */
    public static Node insertAtStart2(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        return temp;

    }

    /* Insert at (End) */
    public static Node insertAtEnd(Node head,int data){
        Node temp = head;
        /* Edge case */
        if(temp == null){
            temp = new Node(data);
            return temp;
        }

        while(temp != null){
            if(temp.next == null)
            {
                temp.next = new Node(data);
                temp = temp.next;
            }
            temp = temp.next;
        }
        return head;
    }

    /* Delete (First Node) */
    public static Node deleteFirstNode(Node head){
        if(head == null)
            return null;
        head = head.next;
        return head;
    }

    /* Delete (First Node) - Sandeep Sir's Solution */
    public static Node deleteFirstNode2(Node head){
        if(head == null)
            return null;
        return head.next;
    }


}

/* Node class */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}