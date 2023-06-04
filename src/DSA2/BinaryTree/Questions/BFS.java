package DSA2.BinaryTree.Questions;
import DSA2.BinaryTree.Sample.*;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        Node root = SingleTree.createTree();
        levelOrder(root);
    }
    public static void levelOrder(Node root) {
        if(root == null) return;

        // Create a Queue
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(" " + temp.key + " ");
            if(temp.left != null) {
                q.add(temp.left);
            }
            if(temp.right != null) {
                q.add(temp.right);
            }
        }
    }
}
