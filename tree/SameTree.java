/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( (null == p && null != q) || (null != p && null == q)) {
            return false;
        }
        if(null == p && null == q) {
            return true;
        } else if(p.val == q.val) {
            return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
        }
        return false;
    }
}