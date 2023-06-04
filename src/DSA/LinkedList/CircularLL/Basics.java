package DSA.LinkedList.CircularLL;

public class Basics {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(5);
        Node n2 = new Node(20);
        Node n3 = new Node(15);

        head.next = n1;
        n1.next = head;
        /*n1.next = n2;
        n2.next = n3;
        n3.next = head;*/

        /*traversalOfCL(head);
        method2(head);*/

        // Create New node list
        Node myList = null;
        myList = insertBegin2(myList,1);
        myList = insertBegin2(myList,10);
       myList = insertBegin(myList,100);
      traversalOfCL(myList);

      // Create another list
        Node yourList = null;
        yourList = insertEnd(yourList,1);
        yourList = insertEnd(yourList,2);
        yourList = insertEnd(yourList,3);
        traversalOfCL(yourList);

    }

    /* Traversal of linked list */
    public static void traversalOfCL(Node head) {
        Node temp = head;
        if(head != null) {
            do{
                System.out.print(" " + temp.val + " " );
                temp = temp.next;
            } while (head != temp);
        }
        System.out.println();
    }

    /* Sandeep Sir's Methods */
    public static void method1(Node head) {
        if(head == null) return;
        System.out.println(head.val);

        for(Node temp = head.next; temp != head; temp = temp.next) {
            System.out.println(temp.val + " ");
        }
    }

    public static void method2(Node head) {
        if(head == null) {
            return;
        }
        Node curr = head;
        do{
            System.out.println(curr.val + "");
            curr = curr.next;
        } while(head != curr);
    }


    /* Insert @ Begin */

    /* Amazing solution by Sandeep Sir */
    /* Time Complexity : O(1) */
    public static Node insertBegin2(Node head, int x) {
        Node node = new Node(x);
        if(head == null) {
            node.next = node;
            return node;
        }
        node.next = head.next;
        head.next = node;
        int data = head.val;
        head.val = node.val;
        node.val = data;

        return head;

    }

    public static Node insertBegin(Node head, int x)  {
        // Step 1: Create New Node
        Node newNode = new Node(x);

        /* Edge Case */
        if(head == null) {
            newNode.next = newNode;
            return newNode;
        }

        // Step 2: Set newNode.next = head
        newNode.next = head;

        // Step 3: Find last Node
        Node lastNode = head;
        while(lastNode.next != head) {
            lastNode = lastNode.next;
        }

        // Step 4: Set lastNode.next = newNode
        lastNode.next = newNode;

        return newNode;


    }


    /* Insert @ End */
    /* My Solution */
    /* Linear Time */
    public static Node insertEnd(Node head, int x) {
        Node node = new Node(x);
        if(head == null) {
            node.next = node;
            return node;
        }
        Node last = head;
        while(last.next != head) {
            last = last.next;
        }
        last.next = node;
        node.next = head;
        return head;
    }


}

/* Node class */
 class Node{
     int val;
     Node next;
     Node(int val) {
         this.val = val;
         this.next = null;
     }
}