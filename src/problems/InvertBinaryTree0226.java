package problems;

public class InvertBinaryTree0226 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }

}