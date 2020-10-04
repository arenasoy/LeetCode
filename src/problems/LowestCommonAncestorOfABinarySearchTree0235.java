package problems;

public class LowestCommonAncestorOfABinarySearchTree0235 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

            if (p.val == root.val || q.val == root.val)
                return root;

            if (p.val <= root.val && q.val <= root.val) {
                if (root.left == null)
                    return root;
                root = root.left;
            } else if (p.val >= root.val && q.val >= root.val) {
                if (root.right == null)
                    return root;
                root = root.right;
            } else {
                return root;
            }

            return lowestCommonAncestor(root, p, q);
        }
    }
}
