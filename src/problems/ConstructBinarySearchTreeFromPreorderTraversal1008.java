package problems;

import java.util.Stack;

public class ConstructBinarySearchTreeFromPreorderTraversal1008 {
    
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    private Stack<TreeNode> stack;

    public TreeNode bstFromPreorder(int[] preorder) {
        
        if (preorder.length == 0)
            return null;
        
        stack = new Stack<TreeNode>();
        
        TreeNode root = new TreeNode(preorder[0]);
        
        if (preorder.length == 1)
            return root;
        
        stack.push(root);
        TreeNode pred = root;
        
        for (int i = 1; i < preorder.length; i++) {
            
            TreeNode cur = new TreeNode(preorder[i]);
            
            if (cur.val < pred.val) {
                pred.left = cur;
                stack.push(cur);
                pred = cur;
            } else if (stack.empty()) {
                pred.right = cur;
                stack.push(cur);
                pred = cur;
            } else {
                TreeNode top = stack.peek();
                boolean inserted = false;
                while (top.val < cur.val) {
                    top = stack.pop();
                    if (stack.empty()) {
                        top.right = cur;
                        pred = cur;
                        inserted = true;
                        stack.push(pred);
                        break;
                    }
                    top = stack.peek();
                }

                if (!inserted) {
                    pred = top.left;
                    
                    while (pred.right != null) {
                        pred = pred.right;
                    }
                    
                    pred.right = cur;
                    pred = cur;
                    stack.push(cur);
                }
            }
        }
        
        return root;
    }

}