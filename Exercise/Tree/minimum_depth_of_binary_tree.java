package Exercise.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class minimum_depth_of_binary_tree {
    public int minDepth(TreeNode root) {
        if ( root == null ){
            return 0;
        }
        int depth = 0 ;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            depth ++ ;
            int size = queue.size();
            while (size > 0){
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null){
                    return depth;   //如果是叶子节点，则直接返回他的高度，就是最小高度
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                size --;
            }
        }
        return depth;
    }

}
