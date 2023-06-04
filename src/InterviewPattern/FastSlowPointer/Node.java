package InterviewPattern.FastSlowPointer;

public class Node {
    int value;
    Node next;
    public Node(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Singly Linked list
        Node root = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);
        Node temp3 = new Node(4);

        root.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp1;

    }
}
