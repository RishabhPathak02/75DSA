package Day57.buildBST;

import java.util.ArrayList;
import java.util.List;

public class sol {

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

    class Solution {
        List<Integer> inorder = new ArrayList<>();
        public TreeNode balanceBST(TreeNode root) {
            inorderTraversal(root);
            return buildBST(root , 0 , inorder.size()-1);
        }
        private void inorderTraversal(TreeNode root){
            if(root == null)return ;
            inorderTraversal(root.left);
            inorder.add(root.val);
            inorderTraversal(root.right);
        }
        private TreeNode buildBST(TreeNode root , int start , int end){
            if(start > end)return null ;
            int mid = start + (end-start) / 2 ;
            root = new TreeNode(inorder.get(mid));
            root.left = buildBST(root.left , start , mid-1);
            root.right =buildBST(root.right, mid+1 , end);
            return root ;
        }
    }
}
