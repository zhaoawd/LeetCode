package tree;

import DataStructure.TreeNode;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (null == root) {
            if (targetSum != 0) {
                return false;
            } else {
                return false;
            }
        }
        if (null == root.left && null == root.right) {
            if (root.val == targetSum) {
                return true;
            } else {
                return false;
            }
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}