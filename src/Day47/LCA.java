package Day47;

import Day45.levOrder.TreeNode;

public class LCA {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || root == p || root == q)return root ;
            TreeNode leftPart = lowestCommonAncestor(root.left , p , q);
            TreeNode rightPart = lowestCommonAncestor(root.right , p , q);
            if(leftPart != null && rightPart != null)return root ;
            return leftPart != null ? leftPart : rightPart ;
        }
    }
}
