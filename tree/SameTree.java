package tree;

import DataStructure.TreeNode;

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