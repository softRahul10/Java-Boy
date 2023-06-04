package DSA.LinkedList;

public class DoublyLL {
    public static void main(String[] args) {
        /* Creating Nodes for Doubly Linked List */
        N head = new N(10);
        head.next =  new N(20);
        head.next.prev = head;
        head.next.next = new N(30);
        head.next.next.prev = head.next;
        System.out.println("Printing Doubly Linked List : ");
        printDL(head);
        System.out.println("Printing  Doubly Linked List in Reverse Order : ");
        printReverseDL(head);
    }

    /* Traverse Doubly LL */
    public static void printDL(N head){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    /* Traverse in Reverse order */
    public static void printReverseDL(N head){
        while(head.next  != null){
            head = head.next;
        }
        while(head !=null ){
            System.out.println(head.data);
            head = head.prev;
        }
    }
}

/* Doubly linked list Implementation */
class N{
    int data;
    N prev;
    N next;
    N(int data){
        this.data = data;
        prev = null;
        next = null;
    }
}