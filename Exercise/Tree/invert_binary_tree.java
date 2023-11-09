package Exercise.Tree;


public class invert_binary_tree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        invert(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public void invert(TreeNode root){
        TreeNode node = new TreeNode();
        node = root.left;
        root.left = root.right;
        root.right = node;
    }

}
