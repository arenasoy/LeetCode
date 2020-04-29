package problems;

public class BinaryTreeMaximumPathSum0124 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int max;
    
    public int maxPathSum(TreeNode root) {
        
        if (root != null) {
            max = root.val;
        }
        dfs(root);
        
        return max;
    }
    
    private void dfs(TreeNode root) {
        
        if (root == null)
            return;
        
        int left = pathSum(root.left);
        int right = pathSum(root.right);
        
        int sum = root.val;
        
        if (sum + left > sum)
            sum += left;
        
        if (sum + right > sum)
            sum += right;
        
        dfs(root.left);
        dfs(root.right);
        
        if (sum > max) {
            max = sum;
        }
    }
    
    private int pathSum(TreeNode root) {
        
        if (root == null)
            return 0;
        
        int left = pathSum(root.left);
        int right = pathSum(root.right);
        
        if (root.val + left > root.val && root.val + left > root.val + right)
            return root.val + left;
        
        if (root.val > root.val + right)
            return root.val;
        
        return root.val + right;
    }
}