package Day58.BinaryTreeToLinkedList;
import java.util.ArrayList;
public class Sol {

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
        ArrayList<TreeNode>list = new ArrayList<>();
        public void flatten(TreeNode root) {
            if(root == null)return ;
            preorder(root) ;
            TreeNode curr = list.get(0);
            for(int i = 1 ; i<list.size() ; i++){
                curr.right = list.get(i);
                curr.left = null ;
                curr = curr.right ;
            }
        }
        private void preorder(TreeNode root){
            if(root == null)return ;
            list.add(root);
            preorder(root.left);
            preorder(root.right);
        }
    }
}
