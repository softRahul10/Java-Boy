package DSA.Tree.Master;


// class for representing : Binary Tree
class Node{
   int value;
   Node left;
   Node right;
   public Node(int value) {
       this.value = value;
   }
}

public class BT {
    public static void main(String[] args) {
      // Binary Tree Creation
        //       1
        //  2         3

     Node root = new Node(1);
     root.left = new Node(2);
     root.right = new Node(3);

        System.out.println("Inorder");
        inOrderTraversal(root); // 2,1,3

        System.out.println("Pre Order");
        preOrderTraversal(root); // 1 2 3

        System.out.println("Post Order");
        postOrderTraversal(root); // 2 3 1

        System.out.println("Height of Tree is : " + heightOfTree(root));

    }

    // Find Height of Binary Tree
    public static int heightOfTree(Node root) {
        // Base case
        if(root == null) {
            return 0;
        }else{
            return (Math.max(heightOfTree(root.left),heightOfTree(root.right))+1);
        }
    }

    // Tree Traversal: DFS -> Inorder [left, root, right]
    public static void inOrderTraversal(Node root) {
        if(root != null) {
            inOrderTraversal(root.left);
            System.out.println("Value : " + root.value);
            inOrderTraversal(root.right);
        }
    }

    // Tree Traversal: DFS -> Preorder [root, left, right]
    public static void preOrderTraversal(Node root) {
        if(root != null) {
            System.out.println("Valuee : " + root.value);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    // Tree Traversal: DFS -> Postorder [left, right, root]
    public static void postOrderTraversal(Node root) {
        if(root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println("Valueee : " + root.value);
        }
    }
}

