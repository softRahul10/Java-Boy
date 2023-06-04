package DSA.LinkedList.Basics;

public class Node {
    int value;
    Node next;
    public Node(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Linked List :  (Normally)");
        printLL(head);

        System.out.println("Linked List :  (after insert @ Begin) ");
        head = insertBegin(head,1);
        printLL(head);

        System.out.println("Linked List  :  (after insert @ End) ");
        head  = insertInEnd(head,999);
        printLL(head);

        System.out.println("Linked List : (after Deletion of First Node) ");
        head = deleteFirstNode(head);
        printLL(head);

        System.out.println("Linked List : (after Deletion of Last Node) ");
        head = deleteLastNode(head);
        printLL(head);

        System.out.println(" 100 in list  : " + searchInList2(head,100));
        System.out.println(" 10 in list  : " + searchInList2(head,10));

    }

    /* print LL */
    public static void printLL(Node temp) {
        while(temp!=null) {
            System.out.print( temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void recursivePrintLL(Node temp) {
        if(temp == null) {
            return;
        }
        System.out.println(temp.value);
        recursivePrintLL(temp.next); // Tail call optimization
    }

    /* Insert @ Begin */
    public static Node insertInStart(Node temp, int val) {
        Node newHead = temp;
        if(newHead == null) {
            newHead = new Node(val);
            return newHead;
        }
        newHead = new Node(val);
        newHead.next = temp;
        return newHead;
    }
    /* Sir's Solution */
    public static Node insertBegin(Node head, int val) {
        Node temp = new Node(val);
        temp.next  = head;

        return temp;
    }

    /* Insert @ End */
    public static Node insertInEnd(Node head, int val) {
        Node node = new Node(val);
        Node temp = head;
        if(head == null) {
            return node;
        }

        while(head.next != null) {
            head = head.next;
        }
        head.next = node;
        return temp;
    }

    /* Delete First Node */
    public static Node deleteFirstNode(Node head) {
        if(head == null) {
            return null;
        }
        return head.next;
    }

    /* Delete Last Node */
    public static Node deleteLastNode(Node head) {
        if(head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    /* Insert @ Given Position */
    public static Node insertAtPos(Node head, int pos, int val) {
        Node temp = new Node(val);

        if(head == null && pos == 1) {
            return temp;
        }
        if(head == null && pos > 1) {
            return null;
        }
        if(pos < 1) {
            return head;
        }
        if(pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i = 1; i < pos - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if(curr == null) {
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;

        return head;

    }

    /* Searching in a singly linked list */
    public static int searchInList(Node head, int key) {
       Node temp = head;
       int res = 0;

       while(temp != null) {
           res++;
           if(temp.value == key) {
               return res;
           }
           temp = temp.next;
       }

       return -1;
    }

    /* search Recursively */
    public static boolean searchInList2(Node head, int key) {
        if(head == null) {
            return false;
        }
        if(head.value == key) {
            return true;
        }
        return searchInList2(head.next,key);
    }
}
