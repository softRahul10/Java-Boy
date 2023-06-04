package DSA.LinkedList.RevisionCLL;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}


public class CircularLL01 {
    public static void main(String[] args) {
        // Creation of Circular Linked list
        Node head = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);

        // Linking all together
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = head;

        head = insertEnd2(head,4);
        printCL(head);
        head = deleteHead2(head);
        head = deleteHead3(head);

        // Circular Linked List
        //head = insertBegin(head,100);
        printCL(head);
    }


    // Delete K-th Node from List
    public static Node deleteNode(Node head, int k) {
        if(head == null) return null;
        if(head.next == head && k == 1) return null;

        if(k == 1) {
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }

        Node curr = head;
        for (int i = 0; i < k-2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    // Delete Head of list
    public static Node deleteHead4(Node head) {
        if(head == null || head.next == head) {
            return null;
        }
        // Efficient 😍 Approach
        head.data = head.next.data;
        head.next = head.next.next;

        return head;
    }

    // Delete Head of Circular List : Sandeep Sir's Solution (Efficient solution)
    public static Node deleteHead3(Node head) {
        if(head == null || head.next == head) {
            return null;
        }
        // Swapping
        head.data = head.next.data;
        head.next = head.next.next;

        return head;
    }

    // Delete Head of Circular List (Efficient solution)
    public static Node deleteHead2(Node head) {
        if(head == null || head.next == head) {
            return null;
        }
        // Swapping
        Node curr = head.next;
        int t = head.data;
        head.data = curr.data;
        curr.data = t;

        // Change Pointers
        head.next = curr.next;
        curr.next = null;
        return head;
    }



    // Delete Head of Circular List
    public static Node deleteHead(Node head) {
        if(head == null || head.next == head) {
            return null;
        }
        // Find last node
        Node curr = head;
        while(curr.next != head) {
            curr = curr.next;
        }

        curr.next = head.next;
        return head.next;

    }

    // Insert @ End (Efficient Approach) O(1)
    public static Node insertEnd2(Node head, int data) {
        Node temp = new Node(data);
        if(head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int value = head.data;
        head.data = temp.data;
        temp.data = value;

        return temp;

    }



    // Insert @ End ( Naive Approach )
    public static Node insertEnd(Node head, int data) {
        Node temp = new Node(data);
        if(head == null) {
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while(curr.next != head) {
            curr = curr.next;
        }

        curr.next = temp;
        temp.next = head;

        return head;

    }

    // Insert @ Begin O(1) Efficient Approach
    public static Node insertBegin2(Node head, int data) {
        Node temp = new Node(data);
        if(head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        swap(head,temp);
        return head;
    }

    private static void swap(Node n1, Node n2) {
        int data = n1.data;
        n1.data = n2.data;
        n2.data = data;
    }

    // Insert @ Begin O(n) Naive Approach
    public static Node insertBegin(Node head,int data) {
        // 1. Create Node
        Node temp = new Node(data);
        if(head == null) {
            temp.next = temp;
        }else {
            // 2. Find Last Node
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            temp.next = head;
            curr.next = temp;
        }
        return temp;
    }


    // Method 2. Traversal of CLL using for loop
    public static void printCL2(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ⏭ ");
        for (Node curr = head.next; curr != head; curr = curr.next) {
            System.out.print(curr.data + " ⏭ ");
        }
    }

    // Method 1.  Traversal of Circular linked list ( Using do-while )
    public static void printCL(Node head) {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ▶ ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
