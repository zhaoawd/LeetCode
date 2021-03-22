package tree;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
//      递归模式
//      return isMirror(root,root);

//      循环
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (null == left && null == right) {
                continue;
            } else if ( null == left || null == right) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    public boolean isMirror(TreeNode left,TreeNode right) {
        if( null == left && null == right) {
            return true;
        }
        if(null == left || null == right) {
            return false;
        }
        return (left.val == right.val)
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
}