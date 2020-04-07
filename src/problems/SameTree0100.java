package problems;

public class SameTree0100 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (p == null && q == null) {
            return true;
        }
        
        if (p == null) {
            return false;
        }
        
        if (q == null) {
            return false;
        }
        
        if (p.val == q.val) {
            return (
                isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right));
        }
        
        return false;
    }

}