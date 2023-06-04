package InterviewPattern.FastSlowPointer;

public class CycleInList {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);
        Node temp3 = new Node(4);

        root.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp1;

        Node result = hasCycle(root);

    }

    // Detect Cycle
    public static Node hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }

        if( fast == null || fast.next == null)  {
            return null;
        }

        // Find starting of Cycle
        slow = head;
        while(slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
