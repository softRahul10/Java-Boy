package DSA2.BinaryTree;

// Binary Tree
class Node{
    public int key;
    public Node left;
    public Node right;

    public Node(int key) {
        this.key = key;
    }
}

public class Intro {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(40);
        root.left.left = new Node(50);
        root.right.right = new Node(60);

    }
}
