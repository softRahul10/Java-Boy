package DSA2.BinaryTree.Questions;
import DSA2.BinaryTree.Sample.Node;

public class HeightOfTree {
    public static void main(String[] args) {

        Node root = new Node(1);
        /*root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right  = new Node(5);
        root.right.right.left = new Node(6);*/

        System.out.println("Height of Binary Tree is :" + heightOfBinaryTree(root));

    }

    // Height of BT
    public static int heightOfBinaryTree(Node root) {
        if(root == null) {
            return 0;
        }

        return (Math.max(heightOfBinaryTree(root.left),heightOfBinaryTree(root.right))+1);
    }
}
