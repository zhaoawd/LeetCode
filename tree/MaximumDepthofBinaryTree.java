package tree;

import DataStructure.TreeNode;

public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if( null == root) {
            return 0;
        }
        if (null == root.left && null == root.right) {
            return 1;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
}
