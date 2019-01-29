package easy.tree;

/**
 * Given a binary tree, return the tilt of the whole tree.
 *
 * The tilt of a tree node is defined as the absolute difference between
 *      the sum of all left subtree node values and the sum of all right subtree node values.
 * Null node has tilt 0.
 *
 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
 */
public class BinaryTreeTilt {
    int finalTilt = 0;
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }

        int totalValue = getValues(root);
        return finalTilt;
    }

    public int getValues(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftValue = getValues(root.left);
        int rightValue = getValues(root.right);
        finalTilt += Math.abs(leftValue - rightValue);
        return root.val + rightValue + leftValue;
    }
}
