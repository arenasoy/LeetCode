package problems;

public class DiameterOfBinaryTree0543 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private int diameter;
    
    public int diameterOfBinaryTree(TreeNode root) {
        this.diameter = 0;
        dfs(root);
        return this.diameter;
    }
    
    private int dfs(TreeNode root) {
        if (root == null)
            return 0;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        int result = left + right;
        
        if (result > this.diameter)
            this.diameter = result;
        
        if (left > right)
            return left + 1;
        
        return right + 1;
    }

}