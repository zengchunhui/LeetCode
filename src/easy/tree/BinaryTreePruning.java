package easy.tree;

/**
 * We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.
 * <p>
 * Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
 */
public class BinaryTreePruning {

    public TreeNode pruneTree(TreeNode root) {
        if (null == root) {
            return root;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if ((null != root.left && root.left.val == 1) || (null != root.right && root.right.val == 1) || (root.val == 1)) {
            return root;
        } else {
            return null;
        }
    }

//    private boolean isZero(TreeNode node) {
//        if (null == node) {
//            return true;
//        }
//        if (null != node.left && node.left.val == 1) {
//            return false;
//        } else if (null != node.right && node.right.val == 1) {
//            return false;
//        } else {
//            return isZero(node.left) && isZero(node.right);
//        }
//    }
}
