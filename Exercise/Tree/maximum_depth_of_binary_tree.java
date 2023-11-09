package Exercise.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class maximum_depth_of_binary_tree {
    //层次遍历迭代法：
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxDepth = 0 ;  //高度
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size(); //核心的部分，计算每一层有几个节点
            while (len > 0){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                len --;
            }
            maxDepth ++ ;      //每一层循环走完高度++
        }
        return maxDepth;
    }


    //深度遍历递归法
    public int maxDepth2(TreeNode root) {
        if (root == null ){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth,rightDepth) + 1;
    }
}
