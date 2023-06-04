package DSA2.BinaryTree.Sample;
import DSA2.BinaryTree.Sample.Node;

public class SingleTree {
    public static Node emptyTree() {
        return null;
    }
    public static Node oneNodeTree() {
        Node root = new Node(100);
        return  root;
    }
    public static Node createTree() {
        Node  root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        return root;
    }
}
