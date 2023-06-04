package DSA2.BinaryTree.Questions;
import DSA2.BinaryTree.Sample.*;

public class ChildSum {
    public static void main(String[] args) {
        Node root = SingleTree.createTree();
    }
    private static boolean isChildSum(Node root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        int sum = 0;
        if(root.left != null) {
            sum += root.left.key;
        }
        if(root.right != null) {
            sum += root.right.key;
        }

        return (sum == root.key && isChildSum(root.left) && isChildSum(root.right));
    }
}
