package DSA2.BinaryTree.Questions;

import DSA2.BinaryTree.Sample.Node;

import java.util.Stack;

public class IterativeInorder {
    public static void main(String[] args) {

    }

    public static void inorder(Node root) {
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while(curr != null || s.isEmpty() == false) {
            while(curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.println(curr.key);
            curr = curr.right;
        }
    }
}
