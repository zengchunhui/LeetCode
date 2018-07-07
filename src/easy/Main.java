package easy;

import easy.tree.BinaryTreePruning;
import easy.tree.TreeNode;

public class Main {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(0);
        node3.right = node1;
        node3.left = node2;
        TreeNode node4 = new TreeNode(1);
        node4.right = node3;

        BinaryTreePruning pruner = new BinaryTreePruning();
        TreeNode node = pruner.pruneTree(node4);
        System.out.println(node.val);



    }
}
