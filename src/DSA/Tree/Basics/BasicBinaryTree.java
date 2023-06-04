package DSA.Tree.Basics;

public class BasicBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.left = new Node(4);
        root.right.right = new Node(5);
    }
}

/* Binary Tree */
class Node{
    int value;
    Node left;
    Node right;
    public Node(int value) {
        this.value = value;
    }
}
