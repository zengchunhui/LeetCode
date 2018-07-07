package easy.tree;

/**
 * Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
 *
 * The root is the maximum number in the array.
 * The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
 * The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
 * Construct the maximum tree by the given array and output the root node of this tree.
 *
 * <p>
 *  Input: [3,2,1,6,0,5]
 *  Output: return the tree root node representing the following tree:
 *
 *       6
 *     /   \
 *    3     5
 *     \    /
 *      2  0
 *        \
 *         1
 * </p>
 */
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return getTree(nums, 0, nums.length - 1);
    }

    private TreeNode getTree(int[] nums, int left, int right) {
        if (left == right) {
            return new TreeNode(nums[left]);
        } else if (left < right) {
            int mLeft = left;
            int mRight = right;
            while (mLeft < mRight) {
                if (nums[mLeft] < nums[mRight]) {
                    mLeft++;
                } else if (nums[mLeft] > nums[mRight]) {
                    mRight--;
                }
            }
            TreeNode treeNode = new TreeNode(nums[mLeft]);
            treeNode.left = getTree(nums, left, mLeft - 1);
            treeNode.right = getTree(nums, mRight + 1, right);
            return treeNode;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 6, 0, 5};
        MaximumBinaryTree tree = new MaximumBinaryTree();
        TreeNode treeNode = tree.constructMaximumBinaryTree(nums);
        System.out.println(treeNode.right.val);
    }
}
