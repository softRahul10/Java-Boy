package DSA2.BinaryTree.Questions;
import DSA2.BinaryTree.Sample.*;


public class PrintNodesAtK {
    public static void main(String[] args) {
        Node treeOne  = SingleTree.emptyTree();
        Node treeTwo = SingleTree.oneNodeTree();
        Node treeThree = SingleTree.createTree();

        printNodes(treeThree,2);
    }
    public static void printNodes(Node root,int k) {
        if(root == null) return;
        else if(k == 0) {
            System.out.print(root.key);
        }else{
            printNodes(root.left,k-1);
            printNodes(root.right,k-1);
        }
    }
}

