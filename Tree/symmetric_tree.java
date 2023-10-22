package Tree;

import java.util.logging.Level;

public class symmetric_tree {
    public  boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }

    public boolean compare(TreeNode left,TreeNode right){
        if(left != null && right == null){
            return false;
        } else if (left == null && right != null) {
            return false;
        } else if (left == null && right == null) {
            return true;
        } else if (left.val != right.val) {
            return false;
        }else {  // 当 (left.val ==  right.val),就比较他的孩子
            boolean outside = compare(left.left, right.right);  //比较外侧
            boolean inside = compare(left.right, right.left);  //比较内侧
            return (outside && inside);
        }

    }
}
