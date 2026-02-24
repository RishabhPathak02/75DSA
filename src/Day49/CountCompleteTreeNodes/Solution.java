package Day49.CountCompleteTreeNodes;

public class Solution {

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
    class Solution1 {
        public int countNodes(TreeNode root) {
            if (root == null)
                return 0;
            int leftH = getLeftHeight(root);
            int rightH = getRightHeight(root);

            if (leftH == rightH)return (1 << leftH) - 1;

            return 1 + countNodes(root.left) + countNodes(root.right);
        }

        private int getLeftHeight(TreeNode root) {
            int count = 0;
            while (root != null) {
                count++;
                root = root.left;
            }
            return count;
        }

        private int getRightHeight(TreeNode root) {
            int count = 0;
            while (root != null) {
                count++;
                root = root.right;
            }
            return count;
        }
    }
}
