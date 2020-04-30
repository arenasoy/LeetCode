package problems;

public class CheckIfStringValidSequenceFromRootLeavesPathBinaryTree {
    
    class TreeNode {
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
    
    private int[] arr;
    
    public boolean isValidSequence(TreeNode root, int[] arr) {
        
        this.arr = arr;
        int index = 0;
        return valid(root, index);
    }
    
    private boolean valid(TreeNode cur, int index) {
        
        if (index == arr.length || cur == null) {
            return false;
        }
        
        if (cur.val == arr[index]) {
            
            if (cur.left == null && cur.right == null && index == arr.length - 1) {
                return true;
            }
        
            return valid(cur.left, index+1) || valid(cur.right, index+1);
        }
        
        return false;
    }
}