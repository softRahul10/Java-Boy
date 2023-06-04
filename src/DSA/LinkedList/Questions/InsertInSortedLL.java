package DSA.LinkedList.Questions;

//Node class
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertInSortedLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before Reversal");
        printList(head);
        System.out.println("After Reversal");
        head = reverse(head);
        printList(head);
    }

    // Recursive reversal of a linked list
    public static void reverse2(Node head) {

    }


    // Reverse a linked list
    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        while(curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    // Find N-th Node from end of Linked list
    // Efficient Solution Using (2 Pointer)
    private static void printNode2(Node head, int n) {
        if(head == null) return;
        Node first = head;
        Node second = head;
        // 1. Move second pointer n times
        for (int i = 0; i < n && second.next != null; i++) {
            second = second.next;
        }
        if(second.next == null) return;

        // 2. Move first pointer until second != null
        while(second != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println(first.data);
    }
    //@mySolution : Naive Approach
    private static void printNode(Node head, int n) {
        if(head == null) return;

        // I will calculate length of ll
        int numberOfNodes = 0;
        Node temp = head;
        while(temp != null) {
            numberOfNodes++;
            temp = temp.next;
        }

        // Print n-th node
        if(n > numberOfNodes) return;

        Node curr = head;
        int i = 0;
        while(i < (numberOfNodes - n)) {
            curr = curr.next;
            i++;
        }
        System.out.println(curr.data);
    }


    // Find Middle of a Linked List
    public static Node findMiddle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }



    // Insert In Sorted Linked List
    // @sir's Solution:Logic
    public static Node insertInSortedList2(Node head, int data) {
        // Node Creation
        Node temp = new Node(data);
        if(head == null) return temp;
        if(head.data > data) {
            temp.next = head;
            return temp;
        }

        // If insertion , in middle
        Node curr = head;
        while(curr.next != null && curr.next.data < data) {
            curr = curr.next;
        }

        temp.next = curr.next;
        curr.next = temp;
        return head;

    }


    // @my Solution:Logic
    public static Node insertInSortedList(Node head, int data) {
        // Node creation
        Node temp = new Node(data);
        if(head == null) return temp;

        if(head.data > temp.data) {
            temp.next = head;
            return temp;
        }

        // Main logic
        Node curr = head;
        while(curr.next != null) {
            if(temp.data > curr.next.data) {
                curr = curr.next;
            } else {
                temp.next = curr.next;
                curr.next = temp;
                return head;
            }
        }

        // Insert In End
        curr.next = temp;
        return head;
    }

    // print list
    public static void printList(Node head) {
        while(head != null) {
            System.out.print(" [" + head.data + "] -> ");
            head = head.next;
        }
        System.out.println();
    }
}
