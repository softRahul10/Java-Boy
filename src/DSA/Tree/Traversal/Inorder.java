package DSA.Tree.Traversal;

class Node{
    int value;
    Node left;
    Node right;
    public Node(int value) {
        this.value = value;
    }
}

public class Inorder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        /*  1
        * 2  3 */

        System.out.println("Inorder Traversal");
        inOrder(root); // 2 1 3

        System.out.println(" \n PreOrder Traversal");
        preOrder(root); // 1 2 3

        System.out.println("\n PostOrder Traversal ");
        postOrder(root); // 2 3 1

    }

    /* Inorder traversal */
    public static void inOrder(Node root) {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    /* PreOrder */
    public static void preOrder(Node root) {
        if(root != null) {
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    /* PostOrder */
    public static void postOrder(Node root) {
        if(root != null) {
            preOrder(root.left);
            preOrder(root.right);
            System.out.println(root.value + " ");
        }
    }


}

