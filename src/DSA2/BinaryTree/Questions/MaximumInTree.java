package DSA2.BinaryTree.Questions;
import DSA2.BinaryTree.Sample.*;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumInTree {
    public static void main(String[] args) {
        Node root = SingleTree.createTree();
        System.out.println(maximumNode(root));
        System.out.println(maximumNodeIterative(root));
    }

    public static float maximumNode(Node root) {
        if(root == null) {
            return Float.NEGATIVE_INFINITY;
        }
        float max = Math.max(maximumNode(root.left),maximumNode(root.right));
        return Math.max(max,root.key);
    }

    public static int maximumNodeIterative(Node root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node temp = q.poll();
            if(temp.key > max) {
                max = temp.key;
            }
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
        return max;
    }
}
